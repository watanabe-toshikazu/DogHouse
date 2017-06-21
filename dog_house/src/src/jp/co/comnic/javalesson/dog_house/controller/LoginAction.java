package jp.co.comnic.javalesson.dog_house.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.javalesson.dog_house.dao.AccountDao;
import jp.co.comnic.javalesson.dog_house.dao.DaoException;
import jp.co.comnic.javalesson.dog_house.entity.ACCOUNT;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String forwardPass = "login";
		
		try {
			ACCOUNT account = new AccountDao().loginAuthenticate(email, password);
			
			if(account != null){
				request.getSession().setAttribute("isAuthenticated", "AUTHENTICATED");
				request.getSession().setAttribute("loginUsername", account.getDisplayName());
				
				response.sendRedirect("/" + request.getServletContext().getServletContextName() + "/");
				
				forwardPass = null;
			}
			else{
				request.setAttribute("error", "[ERROR] Invalid e-mail or password.");
			}
		
		
		
		
		
		}
		 catch (DaoException e) {
//		 TODO: handle exception
		throw new ServletException(e);
		}
		
		
		return forwardPass;
	}
	
}

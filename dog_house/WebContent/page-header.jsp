<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul id="menu">
<h3>
	<a href="/dog_house/index.jsp"> <font size=300%>BOOKS</font>
	</a>
</h3>
</ul>
<div align="center">
<ul id="menu">
	<p class="login-user">
		Login user: ${loginUsername} <a href="${ctxPath}/logout.do"> －
			Logout</a>
	</p>

	<a href="/dog_house/login.jsp">ログイン</a> 
	<a href="/dog_house/mypage.jsp">マイページ</a>
	<a href="/dog_house/cart.jsp">カート</a>
	  </ul>
</div>


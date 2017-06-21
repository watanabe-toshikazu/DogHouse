<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="html-header.jsp">
	<jsp:param name="title" value="Menu" />
</jsp:include>
<body>
	<h1>アカウントを作成</h1>
	<h3>emailとパスワードを入力してください</h3>
	<form action="login.do" method="post">
		<fieldset>
			<div>
				<label for="email">E-Mail </label> <input name="email"
					placeholder="Your email" autofocus>
			</div>
			<div>
				<label for="password">Password </label> <input type="password"
					name="password" placeholder="Your password">
			</div>
			<input type="submit" value="送信">
		</fieldset>
	</form>
	
	<jsp:include page="page-footer.jsp"></jsp:include>
</body>
</html>
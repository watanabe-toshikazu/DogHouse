<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3><a href="/dog_house/index.jsp">BOOKS</a></h3>

<p class="login-user">Login user: ${loginUsername} 
	<a href="${ctxPath}/logout.do"> － Logout</a>
	<a href="/dog_house/cart.jsp">カート</a>
</p>


	<form action="">
		<input name="name"> 
		<input type="submit" value="検索">
	</form>


<c:if test="${param.page != 'menu'}">
	<a href="../"> ← Back to the menu</a>
</c:if>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="../html-header.jsp">
	<jsp:param name="title" value="Menu" />
</jsp:include>

<body>
	<jsp:include page="../page-header.jsp">
		<jsp:param name="page" value="menu" />
	</jsp:include>

	<jsp:include page="../page-header2.jsp">
		<jsp:param name="page" value="menu" />
	</jsp:include>
	<h1>java🍲</h1>

	<ul id="menu">
		<li id="menu01"><a href="xxx.html">Home</a></li>
		<li id="menu02"><a href="xxx.html">Overview</a></li>
		<li id="menu03"><a href="xxx.html">Property</a></li>
		<li id="menu04"><a href="xxx.html">Tips</a></li>
		<li id="menu05"><a href="xxx.html">Contact</a></li>
	</ul>
</body>
</html>
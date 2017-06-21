<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<jsp:include page="html-header.jsp">
		<jsp:param name="title" value="Menu" />
	</jsp:include>
	
<body>

	
		<jsp:include page="page-header.jsp">
			<jsp:param  name="page" value="menu"/>
		</jsp:include>
	
		<h1>Menu</h1>
		
		<div id="menu-panel">
			<ul>
				<li><a href="java/">java</a></li>
				<li><a href="html/">html</a></li>
				<li><a href="sql/">sql</a></li>
				<li><a href="cobol/">cobol</a></li>
			</ul>
		</div>
		
		<jsp:include page="page-footer.jsp"></jsp:include>
		
</body>
</html>
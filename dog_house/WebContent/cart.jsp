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
		
		<h1>カート</h1>
		<p>
		カートの中身表示！！！
		</p>
		<a href="./order.jsp" > 購入へ進む</a>

		
		
		<jsp:include page="page-footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

	<jsp:include page="html-header.jsp">
		<jsp:param name="title" value="Menu" />
	</jsp:include>
	
     <body>
		
		<jsp:include page="page-header.jsp">
			<jsp:param  name="page" value="menu"/>
		</jsp:include>
		
		<jsp:include page="page-header2.jsp">
			<jsp:param  name="page" value="menu"/>
		</jsp:include>
		
		<p>
		<img alt="本1" src="img/book1.jpg" width="170" height="140" align="left">
		本1
		<br>著者　田中
		<br>出版社　トーツー創研
		<br>発行日　2017/06/22
		<br>ページ数　100
		<br>ISBN 123456789
		
		<br clear="left">
		</p>
		
		<p><input type="submit" value="カートに追加"></p>
		
		<jsp:include page="page-footer.jsp"></jsp:include>
		
     </body>
</html>
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
		
		<h1>購入画面</h1>
		
		<p>支払方法</p>
		<input type="radio" name="pay" value="クレジット決済" checked>クレジット決済
		<input type="radio" name="pay" value="コンビニ決済">コンビニ決済
		<p><input type="submit" value="注文確定"></p>
		
		<jsp:include page="page-footer.jsp"></jsp:include>
		
     </body>
</html>
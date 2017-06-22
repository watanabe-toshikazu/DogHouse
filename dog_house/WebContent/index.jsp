<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="html-header.jsp">
	<jsp:param name="title" value="Menu" />
</jsp:include>

<body>


	<jsp:include page="page-header.jsp">
		<jsp:param name="page" value="menu" />
	</jsp:include>

	<jsp:include page="page-header2.jsp">
		<jsp:param name="page" value="menu" />
	</jsp:include>

	<table>
		<tr>
			<th id="menu2">
				<jsp:include page="side_menu.jsp">
					<jsp:param name="page" value="side_menu" />
				</jsp:include>
			</th>

			<th width="768px" height="512px">商品一覧</th>
		</tr>
	</table>
	<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>
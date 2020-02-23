<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>开户</title>
</head>
<body>
<h2>开户</h2>
<form action="${pageContext.request.contextPath }/user/openAcount">
	<table>
		<tr>
			<td>选择银行：</td>
			<td>
				<select name="bank">
					<c:forEach items="${bankList}" var="bank">
						<option>${bank.bankName }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>存入金额：</td>
			<td>
				<input type="text" name="money">
			</td>
		</tr>
	</table>
</form>

</body>
</html>
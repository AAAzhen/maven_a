<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
${msg }
<h2>请登录</h2>
<form action="${pageContext.request.contextPath }/user/login">
	<table>
		<tr>
			<td>
				帐号：
			</td>
			<td>
				<input type="text" name="username">
			</td>
		</tr>
		<tr>
			<td>
				密码：
			</td>
			<td>
				<input type="password" name="password">
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="登录">
			</td>
			<td>
				${loginResult}
			</td>
		</tr>
	</table>
</form>
<p>还没有账户？请<a href="${pageContext.request.contextPath }/index/toRegist">注册</a></p>

</body>
</html>
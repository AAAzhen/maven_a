<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
<h2>请注册</h2>
<form action="${pageContext.request.contextPath }/user/regist">
	<table>
		<tr>
			<td>
				用户名：
			</td>
			<td>
				<input type="text" name="username">*
			</td>
		</tr>
		<tr>
			<td>
				密码：
			</td>
			<td>
				<input type="password" name="password">*
			</td>
		</tr>
		<tr>
			<td>
				再次输入密码：
			</td>
			<td>
				<input type="password" name="repassword">*
			</td>
		</tr>
		<tr>
			<td>
				昵称：
			</td>
			<td>
				<input type="text" name="nickname">
			</td>
		</tr>
		<tr>
			<td>
				年龄：
			</td>
			<td>
				<input type="text" name="age">
			</td>
		</tr>
		<tr>
			<td>
				性别：
			</td>
			<td>
				<input type="text" name="sex">
			</td>
		</tr>
		<tr>
			<td>
				头像：
			</td>
			<td>
				<input type="file" name="headpath">
			</td>
		</tr>
		<tr>
			<td>
				生日：
			</td>
			<td>
				<input type="text" name="birthday">
			</td>
		</tr>
		<tr>
			<td>
				电话：
			</td>
			<td>
				<input type="text" name="phonenumber">
			</td>
		</tr>
		<tr>
			<td>
				邮箱：
			</td>
			<td>
				<input type="text" name="email">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="立即注册">
			</td>
		</tr>
	</table>
</form>
${registResult}<a href="${pageContext.request.contextPath }/index/toLogin">返回登录页面</a>
</body>
</html>
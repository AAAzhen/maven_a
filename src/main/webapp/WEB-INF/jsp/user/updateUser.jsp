<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新用户</title>
</head>
<body>
<h2>请更新用户信息</h2>
<a href="${pageContext.request.contextPath }/index/toHome">返回用户中心</a>
<form action="${pageContext.request.contextPath }/user/updateUser" method="post" enctype="multipart/form-data">
	<input  type="hidden" name="username" value="${user.username }">
	<table>
		<tr>
			<td>
				昵称：
			</td>
			<td>
				<input type="text" name="nickname" value="${user.nickname }">
			</td>
		</tr>
		<tr>
			<td>
				年龄：
			</td>
			<td>
				<input type="text" name="age" value="${user.age}">
			</td>
		</tr>
		<tr>
			<td>
				性别：
			</td>
			<td>
				<input type="text" name="sex" value="${user.sex}">
			</td>
		</tr>
		<tr>
			<td>
				头像：
			</td>
			<td>
				<input type="file" name="headpicpath" value="上传图片">
			</td>
			<td>
				<c:if test="${user.headpath != null}">
					<img title="${user.headpath}" src="${user.headpath}" height="50" width="50">
				</c:if>
				
			</td>
		</tr>
		<tr>
			<td>
				生日：
			</td>
			<td>
				<input type="text" name="birthday" value="${user.birthday }">
			</td>
		</tr>
		<tr>
			<td>
				电话：
			</td>
			<td>
				<input type="text" name="phonenumber" value="${user.phonenumber }">
			</td>
		</tr>
		<tr>
			<td>
				邮箱：
			</td>
			<td>
				<input type="text" name="email" value="${user.email }">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="保存">
			</td>
		</tr>
	</table>
</form>
${msg}

</body>
</html>
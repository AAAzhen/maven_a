<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户首页</title>
</head>
<body>

${loginResult },欢迎您，${user.username } !!!
<p>点击<a href="${pageContext.request.contextPath }/user/logout">退出登录</a></p>
<p><a href="${pageContext.request.contextPath }/index/toUpdateUser">完善</a>个人资料</p>
<p><a href="${pageContext.request.contextPath }/index/toOpenAccount">开户</a></p>
</body>
</html>
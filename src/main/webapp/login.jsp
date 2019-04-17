<%@page pageEncoding="UTF-8" %>
<html>

<body>
<form method="post" action="${pageContext.request.contextPath}/user/login">
    用户名<input type="tetx" name="username"><br>
    密码 <input type="tetx" name="password"><br>
    <input type="submit" value="登录" >
</form>

</body>
</html>

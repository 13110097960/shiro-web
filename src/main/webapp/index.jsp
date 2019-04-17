<%@page pageEncoding="utf-8" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>
<shiro:authenticated>
    <shiro:principal/>
    <shiro:hasPermission name="user:add">
        可以修改
    </shiro:hasPermission>
</shiro:authenticated>
<shiro:notAuthenticated>
    <a href="login.jsp">未登录</a>
</shiro:notAuthenticated>
<h2>Hello World!</h2>
</body>
</html>

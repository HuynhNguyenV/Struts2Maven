<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 9/4/2018
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <s:form action="login" method="POST">
        <s:textfield name="username" label="User Name: "/>
        <s:submit value="Login"/>
    </s:form>

    <h4>
        Error: <s:property value="message"/>
    </h4>

</body>
</html>

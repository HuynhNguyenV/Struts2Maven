<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 9/4/2018
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Say</title>
</head>
<body>
    <s:form action="say">
        <s:textfield name="sayName" label="Name: "/>
        <s:submit value="Submit"/>
    </s:form>

    <s:property value="messages"/>
</body>
</html>

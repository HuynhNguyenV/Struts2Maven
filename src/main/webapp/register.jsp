<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 9/6/2018
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<h1>Register Student!</h1>
<hr/>
<s:form action="register" method="POST">
    <s:select list="countries" name="country" label="Country: "/>
    <s:submit value="Register"/>
</s:form>
<s:if test="message != null">
    <hr/>
    <h4>
        <i>
            <s:property value="message"/>
        </i>
    </h4>
</s:if>
</body>
</html>

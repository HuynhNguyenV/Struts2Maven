<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 9/6/2018
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Course</title>
</head>
<body>
    <h1>Add new Course</h1>
    <s:form action="course" method="POST">
        <s:select list="categories" name="category" label="Country: "/>
        <s:textfield label="Course ID" name="courseID"/>
        <s:textfield label="Name" name="name"/>
        <s:textarea label="Description" name="description"/>
        <s:submit value="Save"/>
    </s:form>

    <s:property value="message"/>
</body>
</html>

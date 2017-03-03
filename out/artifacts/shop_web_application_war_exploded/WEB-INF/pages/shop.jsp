<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mperemojnaia
  Date: 2/17/2017
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    
</head>
<body>
    <div id="bottom-text"><h2>Grab a coffee</h2></div>
    <div id="choice-box-menu-item">
        <form:select path="coffee">
            <form:option value="NONE" label="--- Select ---" />
            <form:options items="${beverageTypes}" />
        </form:select>
    </div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: gaofeng
  Date: 2017/7/11
  Time: 上午10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>helloworld</title>
</head>
<body>
<h1>Hello World !my struts </h1>
<form action="hello">
    <label for="name">Plear enter your name</label><br>
    <input type="text" name="name" id="name"/>
    <input type="submit" value="Say hello"/>
</form>

<form action="login">
    <label for="nametwo">Plear login </label>
    <input type="text" name="name" id="nametwo"/>
    <input type="submit" value="to login"/>
</form>
<br>
<form action="user">
    <label for="password">Plear json result: </label>
    <input type="text" name="name" id="password"/>
    <input type="submit" value="get json"/>
</form>
</body>
</html>

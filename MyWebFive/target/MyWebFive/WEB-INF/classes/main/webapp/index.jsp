<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>maven项目标题</title>
</head>
<body>
<h2>Hello World!</h2><br>
<h3>这是我的新项目!</h3>


<button><h2>我的按钮</h2></button><br>
value of name :<s:property value="name"></s:property><br>
value of key ::<s:property value="key"></s:property><br>
静态变量:<s:property value="staticname"></s:property><br>


</body>
</html>

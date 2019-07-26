<%--
  Created by IntelliJ IDEA.
  User: Jean Eric Ndahimana
  Date: 7/25/2019
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>

<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "action/advice" method="get">
    <select name="roast" disabled="disabled" >
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/><br/>
    <input type="submit" value = "Submit" disabled = "disabled" />
</form>

<p />

<form action="login.do" method="post">

    <p>Login: </p>
    <p> Name : <input type="text" id="name" name="name" /></p>
    <p> Password : <input type="password" id="password" name="password" /></p>
    <p> <input type="submit" value="login" /> </p>
</form>
</body>
</html>

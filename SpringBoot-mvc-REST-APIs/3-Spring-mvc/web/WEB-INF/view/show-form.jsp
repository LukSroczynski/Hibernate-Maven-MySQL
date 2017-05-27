<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.03.2017
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main Page</title>
  </head>
  <body>

  <h2>Form without annotation</h2>
  <form action="processForm2" method="GET">

    <input type="text" name="studentName" placeholder="What's your name?" />

    <input type="submit" />

  </form>

  <h2>Form with annotation: @RequestParam("studentName")</h2>
  <form action="processForm3" method="GET">

    <input type="text" name="studentName" placeholder="What's your name?" />

    <input type="submit" />

  </form>

  </body>
</html>

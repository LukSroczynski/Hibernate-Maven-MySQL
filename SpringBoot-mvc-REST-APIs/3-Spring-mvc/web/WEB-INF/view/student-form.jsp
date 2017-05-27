<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.03.2017
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
  <head>
    <title>Main Page</title>
  </head>
  <body>

  <form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" />
      <br><br>
    First name: <form:input path="lastName" />

      <input type="submit" value="Submit">

  </form:form>

  </body>
</html>

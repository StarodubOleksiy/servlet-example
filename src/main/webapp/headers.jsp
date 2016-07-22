<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="servlet.Tasks" %>


<html>
<body>

<h1 align="center">My ToDo List</h1>
<p>
<form action = "servlet-updates" method = "GET">
  <table border = "1px">
    <tr>
      <td> Name </td><td> Category</td> <td> Complete </td>
    </tr>

      <c:forEach var="user" items="${styles}">
          <tr>
                 <td> <c:out value="${user.getName()}"/></td>
                 <td> <c:out value="${user.getCategory()}"/></td>
              <td><p><input type="checkbox" name="task" value=${user.getName()}></p></td>
          </tr>
      </c:forEach>

    <tr>
      <td colspan = "3"><input type = "submit" value = "Update Tasks"/></td>
    </tr>
  </table>
</form>
<form action = "servlet-parameters" method = "POST">
  <table border = "1px">
    <tr>
      <td><b>Task Name</b></td>
      <td><input type = "text" name = "parameter1"
                 size = "70"/></td>
    </tr>
    <tr>
      <td><b>Task Category</b></td>
      <td><input type = "text" name = "parameter2"
                 size = "65"/></td>
    </tr>
    <tr>
      <td colspan = "2"><input type = "submit" value = "Add Task"/></td>
    </tr>
  </table>


</form>
</body>
</html>
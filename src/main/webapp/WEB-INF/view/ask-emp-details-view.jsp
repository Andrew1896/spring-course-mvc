<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2> Dear Employee, Please enter your details</h2>
<br><br>

<%-- lectia 58, 59, 60, 61
<form action="showDetails" method="get">
<input type="text" name="employeeName"
placeholder="Write your name"/>
<input type="submit"/>
</form>
</body>
</html> --%>

<%-- lectia 62 --%>
 <form:form action ="showDetails" modelAttribute="employee">

   Name <form:input path="name"/>
   <br><br>
   Surname <form:input path="surname"/>
   <br><br>
   Salary <form:input path="salary"/>
   <br><br>
   <input type="submit" value="OK">
   </form:form>

   </body>
   </html>
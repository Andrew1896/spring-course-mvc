<!DOCTYPE html>
<html>

<body>

<h2> Dear Employee, Please enter your details</h2>

<br>
<br>

lectia 61---------------
<form action="showDetails" method="get">
<input type="text" name="employeeName"
placeholder="Write your name"/>
<input type="submit"/>
</form>
-------------------------

<form:form action="showDeatails" addAttribute="employee">

   Name <form:input path="name/">
   <br><br>
   Surname <form:input path="surname/">
   <br><br>
   Salary <form:input path:="salary/">
   <br><br>
   Department<form:select path:="department/">
   ------------------
   <form:option value="Information Technology" label="IT"/>
   <form:option value="Human Resources" label="HR"/>
   <form:option value="Sales" label="Sales"/>
   ------------------
   <form:options items="${employee.departmens}"/>

   </form:select>
   <br><br>

   <input type="submit" value="OK">

</body>

</html>
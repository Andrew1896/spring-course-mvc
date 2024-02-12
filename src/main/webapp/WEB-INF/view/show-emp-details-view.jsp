<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2> Dear Employee, you are Welcome!!!</h2>
<br><br>

<%--lectia 58
 Your name: ${param.employeeName} --%>

<%--lectia 59, 60, 61
Your name: ${nameAttribute} ${description} --%>

<%--lectia 62 --%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}

</body>
</html>
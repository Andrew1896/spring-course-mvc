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
<br>

<%--lectia 63 --%>
Your department: ${employee.department}
<br>

<%--lectia 64 --%>
Your car: ${employee.carBrand}
<br>

<%--lectia 65, 66 --%>
Language(s)
<ul>
<c:forEach var="lang" items="${employee.languages}">
<li>  ${lang} </li>
</c:forEach>
</ul>
<br>

<%--lectia 67 --%>
Phone number: ${employee.phoneNumber}

</body>
</html>
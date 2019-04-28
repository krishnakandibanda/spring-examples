<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WelCome To Data</h2>
${eid} <hr/>${emp}<hr/>
${emp.empId} ${emp.empName} ${emp.empSal} <hr/>

<c:forEach items="${empList}" var="e">
	<c:out value="${e.empId}"/>
	<c:out value="${e.empName}"/>
	<c:out value="${e.empSal}"/>
</c:forEach>

</body>
</html>
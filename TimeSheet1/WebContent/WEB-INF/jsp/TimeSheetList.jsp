<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>

		<h1>BlueBrains Auditing Services Internal Porta-TimeSheets List</h1>

		<form action="/TimeSheet_136211/timelist" method="post">
			<table border="2">
				<tr>
					<td>Enter Employee ID</td>
					<td><input type="text" name="id"/></td>
				</tr>

				<tr>
					<td colspan="2" align="right"><input type="submit" value="Fetch"/></td>				
				</tr>
			</table>
			
			${message}
		</form>
		
		 <c:if test="${time.size()!=0 }"> 
		
			<table border="2" >
				<tr>
					<th>Empid Id</th>
					<th>Date</th>
					<th>1st hour</th>
					<th>2nd hour</th>
				   <th>3rd hour</th>
				   <th>4thhour</th>
					<th>5th hour</th>
				   <th>6th hour</th>
				   <th>7th hour</th>
					<th>8th hour</th>
				   
				
				</tr>
				<c:forEach var="time" items="${times}">
				<tr>
					<td>${time.empid}</td>
					<td>${time.timesheet}</td>
						<td>${time.hour1}</td>
					<td>${time.hour2}</td>
						<td>${time.hour3}</td>
					<td>${time.hour4}</td>
						<td>${time.hour5}</td>
					<td>${time.hour6}</td>
						<td>${time.hour7}</td>
					<td>${time.hour8}</td>
				
				</tr>
				</c:forEach>
			</table>
		 </c:if> 
			<a href=index.jsp>Home</a>
	</div>
</body>
</html>
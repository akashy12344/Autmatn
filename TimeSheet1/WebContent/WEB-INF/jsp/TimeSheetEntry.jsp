<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:form action="addtime" method="post" modelAttribute="my">


		<table align="center" border="5px">


			
<tr>
<td>Employee ID</td>
<td><c:input path="empid" pattern="[A-Z]{3}[1-9]{4}"/></td>
<td><c:errors path="empid" style="color:red"></c:errors>
</tr>

				<tr>
					<td>Time Sheet date</td>
					<td><input type="text" name="timesheet" value="${d}" max="${d}"/></td>
				</tr>


			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour1" items="${myq}"></c:select></td>
			</tr>
			<tr>
			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour2" items="${myq}"></c:select></td>
			</tr>
			<tr>
			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour3" items="${myq}"></c:select></td>
			</tr>
			<tr>
			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour4" items="${myq}"></c:select></td>
			</tr>
			<tr>
			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour5" items="${myq}"></c:select></td>
			</tr>

			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour6" items="${myq}"></c:select></td>
			</tr>
			<tr>
			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour7" items="${myq}"></c:select></td>
			</tr>
			<tr>
			<tr>
				<td>First Hour Activity</td>
				<td><c:select path="hour8" items="${myq}"></c:select></td>
			</tr>
			<tr>


				<td><input type="submit" value="Save"></td>
			</tr>
		</table>

	</c:form>

</body>
</html>
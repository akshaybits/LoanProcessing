<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Applications</title>
<style>
*{
	font-size: 105%;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
}
table#t01 tr:nth-child(odd) {
   background-color:#fff;
}
.button{
	margin-left:100px;
	padding:10px;
	margin-right: 5%;
	border-radius: 10px;
	border-width: 4px;
	border-color: black;
}
.button:hover{
cursor:pointer;
}
</style>
</head>
<body style="height: 100%">
	<div style="margin-top: 30px; margin-left: 50px">
		<h1>View Applications</h1>
		<p>You can view the applications here</p> <!-- 
	 <form id="userForm" action="viewSearch.do" method="get">
			<input type="text" name="searchText"><input type="submit"
				value="Search" />
		</form> --> 	
		<table id="t01", border="1" style="border-collapse: collapse;">
			<tr>
				<th>Application ID</th>
				<th>Applicant Name</th>
				<th>Submitted Date</th>
				<th> Status </th>
			</tr>
			<c:forEach items="${list}" var="item">
				<tr>
					<td><a href="viewSearch.do" onclick="location.href=this.href+'?searchText='+'${item.shortkey}';return false;"><c:out value="${item.shortkey}" /></a></td>
					<td><c:out value="${item.shortfirstname}" /> <c:out value="${item.shortlastname}" /></td>
					<td><c:out value="${item.shortsubmissiondate}" /></td>
					<td><c:out value="${item.shortstatus}" /></td>
				</tr>
			</c:forEach>
			
			
		</table>
		<br /> <br /> <button class="button" onclick="window.location.href='index.jsp'">Back</button>
	</div>
</body>
</html>
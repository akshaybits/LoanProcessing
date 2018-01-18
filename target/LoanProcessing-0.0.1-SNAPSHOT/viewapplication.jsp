<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Application</title>

<style>
#header {

    padding:5px;
}
th,td {
    text-align: right;
    padding : 8px;
}
#left {
    line-height:30px;
    width:40%;
    float:left;
    padding:5px;	      
}
#address {
    width:55%;
    float:left;
    padding:10px;	 	 
}
#footer {
    clear:both;
    padding:5px;	 	 
}
#mixed {
    clear:both;
    text-align:left;
   padding:5px;	 	 
}
.button{
	margin-left:100px;
	padding:10px;
	margin-right: 5%;
	border-radius: 10px;
	border-width: 4px;
	border-color: black;
	float:right;
}
.button:hover{
cursor:pointer;
}
</style>

</head>
<body>
 <c:forEach items="${list}" var="item">
 
<h1>View Application</h1>
<div>
<!-- <div style="float:left;margin-left:20%">
               
		<p> Application ID <c:out value="${item.key}" /> </p>
		<p> Application Status  <c:out value="${item.firstname}" /> </p>
		<p> Score  <c:out value="${item.firstname}" /> </p>
		<p> Decline Reason  <c:out value="${item.firstname}" />  </p>
				<!-- 
<p> Application ID</p>
<p> Application Status </p>
<p> Score </p>
<p> Decline Reason </p> 

</div> -->
<br>

<table style="width:30%">
  <tr>
    <td></td>
    <td>Application ID	</td>		
    <td><c:out value="${item.key}" /></td>
  </tr>
  <tr>
    <td></td>
    <td>Application Status</td>		
    <td><c:out value="${item.status}" /></td>
  </tr>
   <tr>
    <td></td>
    <td> Score</td>		
    <td><c:out value="${item.score}" /></td>
  </tr>
  <tr>
    <td></td>
    <td>Decline Reason</td>		
    <td><c:out value="${item.declinereason}" /></td>
  </tr>
 
</table>
	
<div style="margin-top: 50px; margin-left: 50px">
<h3>Original Application</h3>
		<form style="border-style:solid">
		
		<div id="left">
		<pre>
First Name     :     <c:out value="${item.firstname}" />

Middle Name    :    <c:out value="${item.middlename}" />

Last Name      :    <c:out value="${item.lastname}" />

Date of Birth  :    <c:out value="${item.dob}" />

Marital Status :    <c:out value="${item.maritalstatus}" />

SSN Number     :    <c:out value="${item.ssn}" />

Loan Amount    :    <c:out value="${item.loanamount}" />

Loan Purpose   :    <c:out value="${item.loanpurpose}" />

Description    :    <c:out value="${item.name}" />

</pre>
		</div>
		
		<div id="address">
<fieldset>
<legend> Address </legend>
<pre>
Address Line 1   : <c:out value="${item.addressline1}" />

Address Line 2   : <c:out value="${item.addressline2}" />

City             : <c:out value="${item.city}" />

State            : <c:out value="${item.state}" />

Postal Code      : <c:out value="${item.postalcode}" />
</pre>
</div>

<div id="address"> 
</fieldset>

<br>
<fieldset>
<legend> Contact Information </legend>
<pre>
Home Phone       :  <c:out value="${item.homephone}" />

Office Phone     :  <c:out value="${item.officephone}" />

Mobile           :  <c:out value="${item.mobile}" />

Email Address    :  <c:out value="${item.email}" />
<pre>
</fieldset>
</div>
		<div id="footer">
		<fieldset style="width:95%">
<legend> Employement Details </legend>

<!-- <div style="float:right">
<!-- Work Experience      <c:out value="${item.workexp}" />   <!-- <input type="number" name="workexpm" placeholder="Month"  size="2" style="width:50px"> -->

<!--  Designation          <c:out value="${item.designation}" />
</div>  -->

<pre>
<div style="float:right;margin-right:50px">
Work Experience   Years :  <c:out value="${item.workexp}"/>  Months:<c:out value="${item.workexpm}"/>

Designation        :  <c:out value="${item.designation}" />
</div>
Employer name      :  <c:out value="${item.employername}" /> 

Annual Salary      :  <c:out value="${item.annualsalary}" />

Address 
       Address Line 1   :  <c:out value="${item.empaddressline1}" />
       
       Address Line 2   :  <c:out value="${item.empaddressline2}" />
       
       City             :  <c:out value="${item.empcity}" />
       
       State            :  <c:out value="${item.empstate}" />
       
       Postal Code      :  <c:out value="${item.emppostalcode}" />
</pre>
</fieldset>
<br>
</div>
		
		</form>
	</div>


</div>

</c:forEach>

<a href=view.do><button class="button">Back</button></a>

</body>
</html>
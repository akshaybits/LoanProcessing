<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit your application</title>
<style>
#header {

    padding:5px;
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
</style>
</head>
<body bgcolor="#d3d3d3">

	<div style="margin-top: 50px; margin-left: 50px">
		<h1>Submit your Application</h1>
		<form id="myform" action="add.do" method="post">
		
		<div style="font-size: 15px" id="left">
		<pre>
First Name         <input type="text" name="firstname" placeholder="First Name">

Middle Name        <input type="text" name="middlename" placeholder="Middle Name">

Last Name          <input type="text" name="lastname" placeholder="Last Name">

Date of Birth      <input type="date" name="dob">

Marital Status     <select name="maritalstatus">
  <option value="Single">Single</option>
  <option value="Married">Married</option>
  <option value="Seperated">Seperated</option>
  <option value="Widowed">Widowed</option>
  <option value="Divorsed">Divorced</option>
</select>

SSN Number         <input type="text" name="ssn" placeholder="SSN Number">

Loan Amount        <input type="number" name="loanamount" placeholder="Loan Amount">

Loan Purpose       <select name="loanpurpose">
  <option value="Debt">Debt</option>
  <option value="Education loan">Education Loan</option>
  <option value="Personal loan">Personal Loan</option>
  <option value="Homeloan">Home Loan</option>
</select>  

Description  <textarea rows="5" cols="80" name="name" placeholder="Describe the reason you are applying for the loan" ></textarea>

</pre>
		</div>
		
		<div  style="font-size: 15px" id="address">
<fieldset>
<legend> Address </legend>
<pre>
Address Line 1   <input type="text" name="addressline1" placeholder="Address Line 1">

Address Line 2   <input type="text" name="addressline2" placeholder="Address Line 2">

City             <input type="text" name="city" placeholder="City">

State            <input type="text" name="state" placeholder="State">

Postal Code      <input type="number" name="postalcode" placeholder="Postal Code">
</pre>
</fieldset>

<br>
<fieldset>
<legend> Contact Information </legend>
<pre>
Home Phone        <input type="text" name="homephone" placeholder="Home Phone">

Office Phone      <input type="text" name="officephone" placeholder="Office Phone">

Mobile            <input type="text" name="mobile" placeholder="Mobile">

Email Address     <input type="text" name="email" placeholder="Email Address">
</pre>
</fieldset>
</div>
		<div style="font-size: 15px" id="footer">
		<fieldset style="width:95%">
<legend> Employment Details </legend>
<pre>
<div style="float:right;margin-right:50px">
Work Experience      <input type="number" name="workexp" placeholder="Year" size="2" style="width:50px">    <input type="number" name="workexpm" placeholder="Month"  size="2" style="width:50px"> 

Designation          <input type="text" name="designation" placeholder="Designation" >
</div>
Employer name        <input type="text" name="employername" placeholder="Name">

Annual Salary        <input type="number" name="annualsalary" placeholder="Annual Salary">

<h4>Address</h4>
Address Line 1       <input type="text" name="empaddressline1" placeholder="Address Line 1">

Address Line 2       <input type="text" name="empaddressline2" placeholder="Address Line 2">

City                 <input type="text" name="empcity" placeholder="City">

State                <input type="text" name="empstate" placeholder="State">

Postal Code          <input type="number" name="emppostalcode" placeholder="Postal Code">

</pre>
</fieldset>
<br>
</div>
		
		 <input	float:right; type="submit" value="Submit" />
		 
	<!-- 	 <a href=index.jsp><input float:right type="button" value="Cancel"/></a> -->
     <button onclick="window.location.href='index.jsp'">Cancel</button>      
		</form>
	</div>
	
	
 	<script src="jquery-2.1.4.min.js"></script>
	<script src ="jquery.validate.min.js"></script>
	<script src="additional-methods.min.js"></script>
	<script type="text/javascript">
	jQuery.validator.setDefaults({
		  debug:true,
		  success: "valid"
		});
		$( "#myform" ).validate({
		  
		  rules: {
			firstname:{required:true,maxlength:15},
			middlename:{maxlength:255},
			lastname:{required:true},
			dob:{required:true},
		    addressline1:{required:true,maxlength:255},
		    addressline2:{maxlength:255},
		    city:{required:true},
		    state:{required:true},
		    postalcode:{required:true,number:true,exactlength:6},
		    homephone:{required:true,number:true,exactlength:10},
		    officephone:{number:true},
		    mobile:{required:true, number:true,exactlength:10},
		    email:{email:true,required:true },
		    maritialstatus:{required:true},
		    loanpurpose:{required:true},
		    employername:{required:true,maxlength:255},
		    annualsalary:{required:true, number:true},
		    designation:{maxlength:255},
		    empaddress1:{required:true,maxlength:255},
		    empaddress2:{maxlength:255},
		    empcity:{required:true,maxlength:255},
		    empstate:{required:true,maxlength:255},
		    emppostalcode:{required:true,number:true,exactlength:6},
		    ssn: {required:true,number:true,maxlength:6},
		    loanamount:{required:true,number:true},
		    workexp:{required:true,number:true}
		    
		  },
		  submitHandler:function(form){
		    if($("#myform").valid){
		      form.submit();
		      }
		    }

		});
		jQuery.validator.addMethod("exactlength", function(value, element, param) {
			 return this.optional(element) || value.length == param;
			}, jQuery.validator.format("Please enter exactly {0} characters."));
	</script>
		
</body>
</html>
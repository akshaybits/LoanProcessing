<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success !!!</title>
<style >
div.pad {border-style: solid;
	padding: 10px;
}
*{
	font-size: 120%;
}

.button{
	padding:10px;
	margin-right: 6%;
	border-radius: 10px;
	border-width: 4px;
	border-color: black;
}

.buttons{
	margin-left: 60%;
	padding-top: 50px;
}
.button:hover{
cursor:pointer;
}
</style>
</head>
<body>
	<div class=pad>
<h1 > Application Submitted Successfully </h1>
<p > CONGRATULATIONS !!!! your application is submitted successfully. Our automated system will determine if your application is
accepted or not. </p>

<div class="buttons">

 <button class="button"  onclick="window.location.href='index.jsp'"> Home </button>

<!--  <button class="button" onclick="window.location.href='listemployee.jsp'"> View Applications </button>--> 

 
 <a href="view.do"><button class="button"> View Applications </button></a> 
 
</div>

</div>



</body>
</html>
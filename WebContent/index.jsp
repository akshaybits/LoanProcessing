<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html>
<head>
<style>
div.c1 {border-style:solid;
height:700px;
width:1400px;
font-size:30px;}

p.p1 {
width:60%px;
float:left;

}

#right{
width:25%;
float:right;
margin-top:20px;
}
</style>
</head>



<img src="logo.png" >


<body>
<div class=c1>
<h1> Welcome, Now get your Loan approved instantly !!! </h1>
<p class=p1> Welcome to ABC Bank Loan processing system. Now get your
loan approved immediately using this cool and fully
automated application. </p>

<p class=p1> In order to Submit a new loan request, click on "Submit an
application" link on the right. </p>
<a  id="right" href="show.do">Submit Application</a>
<p class=p1> For viewing existing loan application's , click on "View
applications" link </p>
<a id="right" href="view.do"> View Applications</a>
</div>
</body>
    
</html> -->

<html>
<head>
<title>ABC Bank Ltd</title>
<style>
html{
background-color:#fff}

body{
width:95%;
height:auto;
margin:auto;
background-color:#fff;
font-family:"Arial",'Helvetica Neue',RobotoMedium , Helvetica, sans-serif;
font-size:24px;

}

#logo{
height:200px;
display:inline;
}
.head{
width:100%;


}
.headerTitle{
float:right;
}
.headerTitle p{


text-align:right; 

}

.headerTitle .main{
border-style:solid
font-weight:900;
font-size:40px;
margin-top:65;
padding-bottom:0;
margin-bottom:0;
}
.headerTitle .sub{
margin-top:0;
font-weight:700;
font-size:32px;
}
.leftContent{
width:60%;
height:auto;
float:left;
}
.rightContent{
float:right;
width:25%;
text-align:left;
padding-top:70px;
margin-left:-200px;
}
h1{

padding:30 10 30 10;

font-size:40px;
}

</style>
<body>
<div class="head">
<img id="logo" src="logo.png"  />
<div class="headerTitle" >
<p class="main">ABC Bank</p>
<p class="sub">Loan Processing Application </p>
</div>
</div>
<div class="mainContent">
<h1>Welcome, Now get your loan approved instantly !!!</h1>
<div class="leftContent">

<p>Welcome to ABC Bank Loan processing system. Now get your
loan approved immediately using this cool and fully
automated application.</p><p>
In order to Submit a new loan request, click on "Submit an
application" link on the right.</p><p>
For viewing existing loan application's , click on "View
applications" link</p>
</div>
<div class="rightContent">
<a href="show.do" >Submit an application</a>
<br />
<br />
<br />
<a href="view.do">View Application </a>
</div>
</div>

</head>
</html>

    
    
<!--  response.sendRedirect("show.do");  -->
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Thanks!</title>
<link rel="stylesheet" type="text/css" href="My Website Style.css">
<?php 
$to="trevor.wiedenmann@mtchs.org";
$subject="Formmail Message";
$from=$_REQUEST['email'];
$message="Name: ".$_REQUEST['name']."\nGender: ".$_REQUEST['gender']."\nAge: ".$_REQUEST['age']."\nComments: ".$_REQUEST['comments'];

mail($to, $subject, $message, $from)
?>
</head>
<body>
<div id="header-wrapper">
	<div id="header">
    <div id="banner">
		<div id="logo">
			<h1>TREVOR WIEDENMANN</h1>
		</div>
        <div class="img-border">
        <img src="Images/MTCHS Logo.jpg" width="100" height="100" alt="" />
        </div>
		<div id="menu">
			<ul>
				<li><a href="My Website Homepage.html">Home</a></li>
				<li><a href="My Website Skills Page.html">Skills</a></li>
				<li><a href="My Website Resume Page.html">Resume</a></li>
				<li><a href="My Website Portfolio Page.html">Portfolio</a></li>
				<li><a href="My Website Contact Page.html">Contact</a></li>
			</ul>
		</div>
	</div>
	</div>	
</div>
<div id="wrapper">
	<div id="page-wrapper">
		<div id="page">
			<div id="content">
				<h2>Thank you!</h2>
				<p>Thanks for contacting me! I will reply back to you soon. If you want to go back to my website, click on any of the buttons on the top of this page.</p>
			</div>
		</div>
	</div>
</div>
<div id="footer-bg">
	<div id="footer-content" class="container">
		CONTACTED!
	</div>
</div>
<div id="footer" class="container">
	<p>&copy; Trevor Wiedenmann 2016, Meridian Technical Charter High School, All Rights Reserved.</p>
</div>
</body>
</html>
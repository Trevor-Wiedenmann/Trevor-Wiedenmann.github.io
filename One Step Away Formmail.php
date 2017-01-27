<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Thanks For Contacting!</title>
<link rel="stylesheet" type="text/css" href="One Step Away Styles.css">
<?php 
$to="duane.erickson@mtchs.org";
$subject="Formmail Message";
$from=$_REQUEST['email'];
$message="Name: ".$_REQUEST['fullName']."\nPhone: ".$_REQUEST['tel']."\nComments: ".$_REQUEST['comments'];

mail($to, $subject, $message, $from)
?>
</head>
<body>
<div id="wrapper">
  <div id="header"> </div>
  <div id="content">
  <div id="nav">
      <ul>
        <li><a href="One Step Away Home Page.html">Home</a></li>
        <li><a href="One Step Away About Us Page.html">About Us</a></li>
        <li><a href="One Step Away Contacts Page.html">Contacts</a></li>
        <li><a href="One Step Away Rentals Page.html">Rentals</a></li>
      </ul>
    </div>
    <div id="info">
    Thanks for contacting us! We will be getting to you shortly. To return to any of the pages, click on one of the links on the left.</div>
      </div>
      <div id="footer">&copy; One Step Away Services, 2014. Phone #: (208)-392-4938 Address: 112 Cottonwood Street, Idaho City, ID. 83631
      </div>
</div>
</body>
</html>
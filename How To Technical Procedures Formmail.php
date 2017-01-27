<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Thanks For Contacting!</title>
<link rel="stylesheet" type="text/css" href="How To Technical Procedures Styles.css">
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
  <div id="header">
    <center>
      <img src="Images/How To Technical Procedures Logo.JPG" width="316" height="198" alt=""/>
    </center>
  </div>
  <div id="content">
    <div id="nav">
      <ul>
        <li><a href="How To Technical Procedures Home Page.html">Home</a></li>
        <li><a href="How To Technical Procedures About Us Page.html">About Us</a></li>
        <li><a href="How To Technical Procedures Tutorials Page.html">Tutorials</a></li>
        <li><a href="How To Technical Procedures Contacts Page.html">Contacts</a></li>
      </ul>
    </div>
    <div id="info"> Thanks for contacting us! We will be getting to you shortly. To return to any of the pages, all you need to do is click on one of the links on the left.</div>
  </div>
  <div id="footer">&copy; How To Technical Procedures, 2015. 3800 N. Locust Grove, Meridian, ID 83616, All Rights Reserved </div>
</div>
</body>
</html>
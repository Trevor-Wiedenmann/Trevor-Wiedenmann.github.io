<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Thanks for contacting!</title>
<link rel="stylesheet" type="text/css" href="VRBO Styles.css">
</head>
<?php 
$to="duane.erickson@mtchs.org";
$subject="Formmail Message";
$from=$_REQUEST['email'];
$message="Name: ".$_REQUEST['fullName']."\nPhone: ".$_REQUEST['tel']."\nComments: ".$_REQUEST['comments'];

mail($to, $subject, $message, $from)
?>
<body>
<div id="wrapper">
  <div id="nav">
    <ul>
      <li class="blue_border"><a href="VRBO Overview Page.html">Overview</a></li>
      <li class="blue_border"><a href="VRBO Rates Page.html">Rates</a></li>
      <li class="blue_border"><a href="VRBO Location Page.html">Location</a></li>
      <li class="blue_border"><a href="VRBO Contacts Page.html">Contacts</a></li>
    </ul>
  </div>
  <div id="info"> Thanks for contacting us! We will be getting to you shortly. If you want to return to any of the pages, use the links above. </div>
  <div id="footer">
    <p><img src="Images/VRBO Logo.jpg" width="676" height="205" alt=""/> &copy; HomeAway.com, Inc. 1995-present. Phone #: (208)-392-4938 
  </div>
</div>
</body>
</html>
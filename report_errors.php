<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<h2>Testing Dislpay Errors</h2>
<?php # Script 8.1 - display_errors.php

ini_set('display_errors', 1);

error_reporting(E_ALL | E_STRICT);

foreach ($var as $v) {}
$result = 1/0;

?>
</body>
</html>
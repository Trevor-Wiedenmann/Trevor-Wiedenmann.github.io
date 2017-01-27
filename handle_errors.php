<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<h2>Testing Dislpay Errors</h2>
<?php # Script 8.1 - display_errors.php

define('LIVE', TRUE);

function my_error_handler ($e_number, $e_message, $e_file, $e_line, $e_vars) {
	$message = "An error occurred in script '$e_file' on line $e_line: $e_message\n";
	$message .= print_r ($e_vars, 1);
	
	if (!LIVE) {
		echo '<pre>' . $message . "\n";
		debug_print_backtrace();
		echo '</pre><br />';
	} else {
		echo '<div class="error">A system error occurred. We apologize for the inconvenience.</div><br />';
	}
	
}

set_error_handler ('my_error_handler');

foreach ($var as $v) {}
$result = 1/0;

?>
</body>
</html>
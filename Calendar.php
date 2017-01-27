<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<form action="Calendar.php" method="post">
<?php
$months = array (1 => 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December');
#$days = range (1, 31);
#$years = range (2011, 2021);
echo '<select name="month">';
foreach ($months as $key => $value) {
	echo "<option value=\"$key\">
	$value</option>\n";
echo '<select name="day">';
for ($day = 1; $day <= 31; $day++) {
	echo '<option value=\"$day\">$day</option>\n';
}
}
foreach ($days as $value) {
	echo "<option value=\"$value\">
	$value</option>\n";
	echo '</select>';
	echo '<select name="year">';
	for ($year = 2011; $year <= 2021; $year++) {
		echo '<option value=\"$year\">
		$year</option>\n';
	}
}
	foreach ($years as $value) {
		echo "<option value=\"$value\">
		$value</option\n";
	}
	echo '</select>';
?>
</form>
</body>
</html>
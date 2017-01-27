<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<?php
$mexico = array (
'YU' => 'Yucatan',
'BC' => 'Baja California',
'OA' => 'Oaxaca'
);

$us = array (
'MD' => 'Maryland',
'IL' => 'Illinois',
'PA' => 'Pennsylvania',
'IA' => 'Iowa'
);

$canada = array (
'QC' => 'Quebec',
'AB' => 'Alberta',
'NT' => 'Northwest Territories',
'YT' => 'Yukon',
'PE' => 'Prince Edward Island'
);
$n_america = array (
'Mexico' => $mexico,
'United States' => $us,
'Canada' => $canada,
);

foreach ($n_america as $country => $list) {
	echo "<h2>$country</h2><ul>";
}

foreach ($list as $k => $v) {
	echo "<li>$k - $v</li>\n";
	echo '</ul>';
}
?>
</body>
</html>
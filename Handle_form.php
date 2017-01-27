<!doctype html>
<html>
<head>
<style type="text/css"
title="text/css" media="all">
.error {
	font-weight: bold;
	color: #C00;
}
</style>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<?php
$name = $_REQUEST['name'];
$email = $_REQUEST['email'];
$comments = $_REQUEST['comments'];
if (isset($_REQUEST['gender'])) {
	$gender = $_REQUEST['gender'];
} else {
	$gender = NULL;
}
if (!empty($_REQUEST['name'])) {
	$name = $_REQUEST['name'];
} else {
	$name = NULL;
	echo '<p class="error">You forgot to enter your name!</p>';
}
if (!empty($_REQUEST['email'])) {
	$name = $_REQUEST['email'];
} else {
	$name = NULL;
	echo '<p class="error">You forgot to enter your email address!</p>';
}
if (!empty($_REQUEST['comments'])) {
	$name = $_REQUEST['comments'];
} else {
	$name = NULL;
	echo '<p class="error">You forgot to enter a comment!</p>';
}
if ($name && $email && $gender && $comments) {
	echo "<p>Thank you, <strong>$name</strong>, for the following comments: <br />
<tt>$comments</tt></p>
<p>We will reply to you at  <i>$email</i>. </p>\n";
} else {
	echo '<p class="error">Please go back and fill out the form again.</p>';
}
if ($gender == 'M') {
	echo '<p><strong>Good day, Sir!</strong</p>';
} elseif ($gender == 'F') {
	echo '<p><strong>Good day, Madam!</strong></p>';
} else {
	$gender = NULL;
	echo '<p class="error"><strong>You forgot to enter your gender!</strong></p>';
}
?>

<?php
if ( !empty($_POST['name']) && !empty($_POST['comments']) && !empty($_POST['email']) ) {
	echo "<p>Thank you, <strong>{$_POST['name']}</strong>, for the following comments:<br />
	<tt>{$_POST['comments']}</tt></p>
	<p>We will reply to you at <i>{$_POST['email']}</i>.</p>/n";
} else {
	echo '<p>Please go back and fill out the form again.</p>';
}
?>
</body>
</html>
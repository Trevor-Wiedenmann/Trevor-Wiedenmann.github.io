<?php

function create_ad() {
	echo '<p class="ad">This is an annoying ad! This is an annoying ad! This is an annoying ad! This is an annoying ad!</p>';
}


$page_title = 'Welcome to this Site!';
include ('includes/header.html');

create_ad();
?>

<h1>Content Header</h1>
<p>This is where the page specific content goes. This section, and the corresponding header, will change from one page to the next.</p>

<?php
create_ad();
include ('includes/footer.html');
?>
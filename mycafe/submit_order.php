<?php
// Database connection details
$servername = "localhost";
$username = "root";  // Replace with your MySQL username
$password = "";  // Replace with your MySQL password
$dbname = "mycafe";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Set parameters and execute the statement
$name = $_POST['name'];
$contact = $_POST['contact'];
$address = $_POST['address'];
$od = $_POST['od'];
$tbno = $_POST['tbno'];
$smoothies = $_POST['smoothies'];
$coffee = $_POST['coffee'];
$icoffee = $_POST['icoffee'];
$waffles = $_POST['waffles'];
$oatmeal = $_POST['oatmeal'];
$pancakes = $_POST['pancakes'];

$sql = "INSERT INTO myorder (name, contact, address, od, tbno, smoothies, coffee, icoffee, waffles, oatmeal, pancakes) 
        VALUES ('$name', '$contact', '$address', '$od', '$tbno', '$smoothies', '$coffee', '$icoffee', '$waffles', '$oatmeal', '$pancakes')";

// Execute the query
if ($conn->query($sql) === TRUE) {
    header("Location:index.html");
    setcookie('submitted', 'true', time() + 3600, '/'); 
} else {
    echo "failed: " . $conn->error;  // Echo 'failed' and any SQL error if something goes wrong
}

$conn->close();
?>

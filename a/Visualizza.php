<?php
$servername = "localhost";
$username = "root";
$password = "stage530";
$dbname = "livellosuccessivo";

$CodiceScuola = $_POST["CodiceScuola"];

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT CodiceScuola, Ore, LavoroSvolto, Autore FROM ControlloOre";
$result = $conn->query($sql); 

if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {
    	if($row["CodiceScuola"] == $CodiceScuola){
           echo "Operazione effettuata: " . $row["LavoroSvolto"]. " <br> tempo di esecuzione: " .$row["Ore"]. " ore <br>";
    	}
    }
} 
?>
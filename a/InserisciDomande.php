<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "interstellar";


$Domanda = $_POST["Domanda"];
$RispostaVera = $_POST["RispostaVera"];
$Risposta1 = $_POST["Risposta1"];
$Risposta2 = $_POST["Risposta2"];
$Risposta3 = $_POST["Risposta3"];

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connessione fallita!/n motivi: " . $conn->connect_error);
} 
echo "Connessione riuscita! ";

$sql = "INSERT INTO Domande (Domanda, RispostaVera, Risposta1, Risposta2, Risposta3)
VALUES ('$Domanda' ,'$RispostaVera', '$Risposta1', '$Risposta2', '$Risposta3')";

if ($conn->query($sql) === TRUE) {
    echo "Dati inseriti correttamente nel record!";
} else {
    echo "Errore: " . $sql . "<br>" . $conn->error;
}
$conn->close();
?>
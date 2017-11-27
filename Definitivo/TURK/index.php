<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
	<link href="css.css" rel="stylesheet" type="text/css">
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
	<div id="container">
        <FORM NAME="InserimentoDomande" METHOD="POST" ACTION="InserisciDomande.php">
            <h4>Inserisci la domanda</h4>
            <INPUT TYPE="text" NAME="Domanda" style="border:2px solid black">
                        <br></br>
            <h4>Inserisci la risposta vera</h4>
            <INPUT TYPE="text" NAME="RispostaVera" style="border:2px solid black">
                        <br></br>
            <h4>Inserisci la risposta 1</h4>
            <INPUT TYPE="text" NAME="Risposta1" style="border:2px solid black">
                        <br></br>
            <h4>Inserisci la risposta 2</h4>
            <INPUT TYPE="text" NAME="Risposta2" style="border:2px solid black">
                        <br></br>
            <h4>Inserisci la risposta 3</h4>
            <INPUT TYPE="text" NAME="Risposta3" style="border:2px solid black">
                        <br></br>
            <INPUT TYPE="submit" VALUE="Inserisci" style="border:2px solid black">

            <?php
            // put your code here
            ?>
        </FORM>
		</div>
    </body>
    
</html>

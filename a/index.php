<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <FORM NAME="InserimentoDomande" METHOD="POST" ACTION="InserisciDomande.php">
            <h4>Inserisci la domanda</h4>
            <INPUT TYPE="text" NAME="Domanda">
                        <br></br>
            <h4>Inserisci la risposta vera</h4>
            <INPUT TYPE="text" NAME="RispostaVera">
                        <br></br>
            <h4>Inserisci la risposta 1</h4>
            <INPUT TYPE="text" NAME="Risposta1">
                        <br></br>
            <h4>Inserisci la risposta 2</h4>
            <INPUT TYPE="text" NAME="Risposta2">
                        <br></br>
            <h4>Inserisci la risposta 3</h4>
            <INPUT TYPE="text" NAME="Risposta3">
                        <br></br>
            <INPUT TYPE="submit" VALUE="Inserisci">

            <?php
            // put your code here
            ?>
        </FORM>
    </body>
    
</html>

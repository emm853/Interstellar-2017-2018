/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author f.bonetti
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Risposta Giusta = new Risposta("Giusta", true);
        Risposta Sbagliata = new Risposta("Sbagliata", false);
        Domanda Prima = new Domanda("Rispondi", Giusta, Sbagliata, Sbagliata, Sbagliata);
        Domanda Seconda = new Domanda("Rispondi", Sbagliata, Giusta, Sbagliata, Sbagliata);
        Domanda Terza = new Domanda("Rispondi", Sbagliata, Sbagliata, Sbagliata, Giusta);
        Gioco Partita = new Gioco();
        Partita.InserisciDomanda(Prima);
        Partita.InserisciDomanda(Seconda);
        Partita.InserisciDomanda(Terza);
        Partita.InserisciDomanda(Prima);
        Partita.InserisciDomanda(Terza);
    }
    
}

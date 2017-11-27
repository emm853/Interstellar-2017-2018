/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author f.bonetti
 */
public class Gioco {
    public Domanda[] Domande;
    
    public Gioco(){
        Domanda[] Domande= new Domanda[5]; 
    }
    
    public boolean InserisciDomanda(Domanda DomandaDaInserire){
        for(int i=0; i<5; i++){
            if(this.Domande[i]==null){
                this.Domande[i]=DomandaDaInserire;
                return true;
            }
        }
        return false;
    }
    
    public void Run(){
        Scanner Input;
        int Risposta;
        int Punteggio = 0;
        for(int i=0; i<5; i++){
            System.out.println(Domande[i].getTestoDomanda());
            System.out.println("1) "+Domande[i].Risposta1.getTesto());
            System.out.println("2) "+Domande[i].Risposta2.getTesto());
            System.out.println("3) "+Domande[i].Risposta3.getTesto());
            System.out.println("4) "+Domande[i].Risposta4.getTesto());
            System.out.println("Inserisci il numero della risposta corretta");
            Input = new Scanner(System.in);
            Risposta = Input.nextInt();
            switch(Risposta){
                case 1:
                    if(this.Domande[i].Risposta1.isVera()){
                        Punteggio++;
                    }
                    break;
                case 2:
                    if(this.Domande[i].Risposta2.isVera()){
                        Punteggio++;
                    }
                    break;
                case 3:
                    if(this.Domande[i].Risposta3.isVera()){
                        Punteggio++;
                    }
                    break;
                case 4:
                    if(this.Domande[i].Risposta4.isVera()){
                        Punteggio++;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("Punteggio: " + Punteggio + "/5");
    }
}

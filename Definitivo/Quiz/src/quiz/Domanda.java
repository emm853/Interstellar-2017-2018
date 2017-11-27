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
public class Domanda {
    private String TestoDomanda;
    Risposta Risposta1;
    Risposta Risposta2;
    Risposta Risposta3;
    Risposta Risposta4;

    public String getTestoDomanda() {
        return TestoDomanda;
    }

    public void setTestoDomanda(String TestoDomanda) {
        this.TestoDomanda = TestoDomanda;
    }

    public Risposta getRisposta1() {
        return Risposta1;
    }

    public void setRisposta1(Risposta Risposta1) {
        this.Risposta1 = Risposta1;
    }

    public Risposta getRisposta2() {
        return Risposta2;
    }

    public void setRisposta2(Risposta Risposta2) {
        this.Risposta2 = Risposta2;
    }

    public Risposta getRisposta3() {
        return Risposta3;
    }

    public void setRisposta3(Risposta Risposta3) {
        this.Risposta3 = Risposta3;
    }

    public Risposta getRisposta4() {
        return Risposta4;
    }

    public void setRisposta4(Risposta Risposta4) {
        this.Risposta4 = Risposta4;
    }
    
    public Domanda(String TestoDomanda, Risposta Rispota1, Risposta Risposta2, Risposta Risposta3, Risposta Risposta4){
        this.setTestoDomanda(TestoDomanda);
        this.setRisposta1(Risposta1);
        this.setRisposta2(Risposta2);
        this.setRisposta3(Risposta3);
        this.setRisposta4(Risposta4);
    }
}

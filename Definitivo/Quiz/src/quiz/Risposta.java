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
public class Risposta {
    private String Testo;
    private boolean Vera;

    public String getTesto() {
        return Testo;
    }

    public void setTesto(String Testo) {
        this.Testo = Testo;
    }

    public boolean isVera() {
        return Vera;
    }

    public void setVera(boolean Vera) {
        this.Vera = Vera;
    }
    
    public Risposta(String Testo, boolean Vera){
        this.setTesto(Testo);
        this.setVera(Vera);
    }
    
}

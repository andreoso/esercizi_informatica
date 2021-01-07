/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1;

/**
 *
 * @author andre
 */
public class Pensionato extends Persona {
    private String comune_residenza;

    public Pensionato(String comune_residenza) {
        this.comune_residenza = comune_residenza;
    }

    public Pensionato() {
    }

    public Pensionato(String comune_residenza, String nome, String cognome, String cf, int ssn) {
        super(nome, cognome, cf, ssn);
        this.comune_residenza = comune_residenza;
    }

    public Pensionato(String nome, String cognome, String cf, int ssn) {
        super(nome, cognome, cf, ssn);
    }

    
    
    public String getComune_residenza() {
        return comune_residenza;
    }

    public void setComune_residenza(String comune_residenza) {
        this.comune_residenza = comune_residenza;
    }
    
    
}

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
public class Persona {
    private String nome;
    private String cognome;
    private String cf;
    private int ssn;

    public Persona() {
    }

    public Persona(String nome, String cognome, String cf, int ssn) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.ssn = ssn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    
    
    
}

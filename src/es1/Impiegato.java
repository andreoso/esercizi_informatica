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
public class Impiegato extends Persona {
    private int matricola;
    private String tel_aziendale;

    public Impiegato(int matricola, String tel_aziendale) {
        this.matricola = matricola;
        this.tel_aziendale = tel_aziendale;
    }

    public Impiegato(int matricola, String tel_aziendale, String nome, String cognome, String cf, int ssn) {
        super(nome, cognome, cf, ssn);
        this.matricola = matricola;
        this.tel_aziendale = tel_aziendale;
    }

    public Impiegato(String nome, String cognome, String cf, int ssn) {
        super(nome, cognome, cf, ssn);
    }
    

    public Impiegato() {
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getTel_aziendale() {
        return tel_aziendale;
    }

    public void setTel_aziendale(String tel_aziendale) {
        this.tel_aziendale = tel_aziendale;
    }
    
    
}

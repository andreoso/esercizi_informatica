/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1;

/**
 *
 * @author andreoso <andrea@andreasau.it>
 */
public class Es1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impiegato i1 = new Impiegato(1234, "0283716273", "Mario", "Rossi", "RSSMRO00X00E000E", 1100);
        
        System.out.println("Il nome dell'impiegato i1 è " + i1.getNome()); //metodo di 'Impiegato' ereditato da 'Persona'
        System.out.println("La matricola dell'impiegato è: " + i1.getMatricola()); //metodo di 'Impiegato'
        
    }
    
}

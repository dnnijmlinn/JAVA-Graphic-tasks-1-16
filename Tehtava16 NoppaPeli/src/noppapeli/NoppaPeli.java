/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noppapeli;

import java.util.Scanner;

/**
 *
 * @author denisbogdanov
 */
public class NoppaPeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Noppa kone1 = new Noppa(6);
        Noppa kone2 = new Noppa(6);
        Noppa pelaaja1 = new Noppa(6);
        Noppa pelaaja2 = new Noppa(6);
        int koneSumma = 0;
        int pelaajaSumma = 0;
        boolean jatkuu = true;
        String rivi;
        char vastaus ='k';
        
        System.out.println("Tämä ohjelma pelaa venttiä kahdella nopalla.");
        do {
            if (vastaus == 'k') {
                System.out.println("Haluatko heitaa noppia (k/e)?");
                rivi = input.nextLine();
                vastaus = rivi.charAt(0);
            }
            
            // tietokone heittää jos koneSumma = 0 tai koneSumma < 21 ja koneSumma < pelaajaSumma
            if (koneSumma == 0 || ((koneSumma < 21) && (koneSumma < pelaajaSumma))) {
                kone1.heita();
                kone2.heita();
                koneSumma += kone1.getArvo() + kone2.getArvo();
            }
            // pelaaja heittää jos vastaus 'k'
            if (vastaus == 'k') {
                pelaaja1.heita();
                pelaaja2.heita();
                pelaajaSumma += pelaaja1.getArvo() + pelaaja2.getArvo();
            }
            System.out.println("Koneella on " + koneSumma + " pistettä.");
            System.out.println("Pelaajalla on " + pelaajaSumma + " pistettä.");
            if ((koneSumma > 21) || (pelaajaSumma > 21) || ((vastaus == 'e') && (pelaajaSumma <= koneSumma)))  {
                jatkuu = false;
            }
        } 
        
        while (jatkuu);
        // Tulosten julistaminen
        if((koneSumma > 21) && (pelaajaSumma > 21)){
            System.out.println("Molemmat hävisivät.");            
        } else if ((koneSumma > 21) && (pelaajaSumma <=21)) { // pelaaja voitti
            System.out.println("Pelaaja voitti!!");
        } else if ((koneSumma <= 21) && (pelaajaSumma > 21)) { //kone voitti
            System.out.println("Kone voitti!!");
        } else if (koneSumma >= pelaajaSumma) { // kone voitti
            System.out.println("Kone voitti!!");
        } else {
            System.out.println("Pelaaja voitti!!");
        }
        
    }  
    
}

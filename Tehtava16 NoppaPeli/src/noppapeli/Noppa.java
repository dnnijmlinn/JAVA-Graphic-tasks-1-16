/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noppapeli;

import java.util.Random;

/**
 *
 * @author denisbogdanov
 */
public class Noppa {
    private int sivut;
    private int arvo;
    
    public Noppa(int sivut) {
        this.sivut = sivut;
        heita();
    }

    public int getSivut() {
        return sivut;
    }

    public int getArvo() {
        return arvo;
    }

    public void setSivut(int sivut) {
        this.sivut = sivut;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public void heita(){
        Random rand = new Random();
        arvo = rand.nextInt(sivut) +1;
    }
    
    
    
}

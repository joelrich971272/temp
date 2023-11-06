package fr.btsciel;

import fr.btsciel.Temperature;

import java.util.Random;

public class Ihm {
    public static void main(String[] args) {
        Random rd = new Random() ;
        Temperature[] temperatures = new Temperature[7] ;
        for (int i = 0; i < temperatures.length ; i++) {
            temperatures[i] = new Temperature() ;
        }
        temperatures[0].jour = "Lundi" ;
        temperatures[1].jour = "Mardi" ;
        temperatures[2].jour = "Mercredi" ;
        temperatures[3].jour = "Jeudi" ;
        temperatures[4].jour = "Vendredi" ;
        temperatures[5].jour = "Samedi" ;
        temperatures[6].jour = "Dimanche" ;
        for (int i = 0; i < temperatures.length; i++) {

            temperatures[i].matin = rd.nextDouble(10)-10 ;
            temperatures[i].soir = rd.nextDouble(10)+20 ;
        }
    }
}

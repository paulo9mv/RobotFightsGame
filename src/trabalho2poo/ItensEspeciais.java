/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2poo;

import java.util.Random;

/**
 *
 * @author Paulo Vitor
 */
public class ItensEspeciais {
    public Arma armaAleatoria(){
        Random random = new Random();
        int decisaoArma = random.nextInt(100);
        Arma a;
        
        if(decisaoArma < 20){
            ///LASERCANNON
            a = new Arma("LaserCannon", 200);
        }
        else if(decisaoArma >= 20 && decisaoArma < 40){
            //MISSILES
            a = new Arma("Misseles", 100);
        }
        else if(decisaoArma >= 40 && decisaoArma < 60){
            //GAUSSCANNON
            a = new Arma("GaussCannon", 70);
        }
        else if(decisaoArma >= 60 && decisaoArma < 80){
            //SHOCKCANNON;
            a = new Arma("ShockCannon", 150);
        }
        else{
            //RAILGUN
            a = new Arma("Railgun", 300);
        }
        
        return a;
    }
}

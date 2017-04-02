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
public class Arma extends ItensEspeciais{
    public static final int LASERCANNON_ID = 1;
    public static final int MISSILES_ID = 2;
    public static final int GAUSSCANNON_ID = 3;
    public static final int SHOCKCANNON_ID = 4;
    public static final int RAILGUN_ID = 5;
    
    public static final String LASERCANNON = "LaserCannon";
    public static final String MISSILES = "Missiles";
    public static final String GAUSSCANNON = "GaussCannon";
    public static final String SHOCKCANNON = "ShockCannon";
    public static final String RAILGUN = "Railgun";
    
    public static final int LASERCANNON_DAMAGE = 200;
    public static final int MISSILES_DAMAGE = 100;
    public static final int GAUSSCANNON_DAMAGE = 70;
    public static final int SHOCKCANNON_DAMAGE = 150;
    public static final int RAILGUN_DAMAGE = 300;
    
    
    public Arma(String name, int dano){
        this.name = name;
        this.dano = dano;
    }
    public Arma(){
        super();
        armaAleatoria();
    }
    private void armaAleatoria(){
        Random random = new Random();
        int decisaoArma = random.nextInt(100);
        Arma a;
        
        if(decisaoArma < 20){
            ///LASERCANNON
            this.name = "LaserCannon";
            this.dano = 300;
        }
        else if(decisaoArma >= 20 && decisaoArma < 40){
            //MISSILES
            this.name = "Missiles";
            this.dano = 100;
        }
        else if(decisaoArma >= 40 && decisaoArma < 60){
            //GAUSSCANNON
            this.name = "GaussCannon";
            this.dano = 70;
        }
        else if(decisaoArma >= 60 && decisaoArma < 80){
            //SHOCKCANNON;
            this.name = "ShockCannon";
            this.dano = 150;
        }
        else{
            //RAILGUN
            this.name = "Railgun";
            this.dano = 300;
        }
    }
}

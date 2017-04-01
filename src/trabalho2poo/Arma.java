/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2poo;

/**
 *
 * @author Paulo Vitor
 */
public class Arma {
    private int dano;
    private String type;
    
    public Arma(String type, int dano){
        this.dano = dano;
        this.type = type;
    }
    public int getArmaDano(){
        return dano;
    }
}

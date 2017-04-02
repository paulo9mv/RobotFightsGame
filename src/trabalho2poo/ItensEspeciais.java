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
    public final static int TYPE_ARMA = 0;
    public final static int TYPE_VIRUS = 1;
    public final static int TYPE_BOMBA = 2;
    
    protected int dano;
    protected int turnos;
    protected int type;
    protected String name;
    
    public ItensEspeciais(){
      
    }
    public ItensEspeciais(String name, int type, int dano){
        this.name = name;
        this.type = type;
        this.dano = dano;
    }
    public int getDano(){
        return dano;
    }
    public void setEffects(){
        
    }
}

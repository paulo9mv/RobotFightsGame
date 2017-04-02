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
public class Posicao {
    public final static int TYPE_ARMA = 0;
    public final static int TYPE_VIRUS = 1;
    public final static int TYPE_BOMBA = 2;
    
    private boolean hasRobot;
    private Robo r;
    
    private boolean hasSpecial;
    
    private ItensEspeciais itemEspecial;
    
    public int x, y, z;
    
    public Posicao(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        
        hasSpecial = false;
    }
    public Posicao(int x, int y, int z, ItensEspeciais i){
        this.x = x;
        this.y = y;
        this.z = z;
        
        this.itemEspecial = i;
        this.hasSpecial = true;
    }    
    public int getType(){
        return this.itemEspecial.type;
    }
    public String getName(){
        return this.itemEspecial.name;
    }
    public void setRobot(Robo r){
        this.r = r;
        this.hasRobot = true;
    }
    public void removeRobot(){
        this.hasRobot = false;
    }
    public boolean hasRobot(){
        return this.hasRobot;
    }
    public void removeItemEspecial(ItensEspeciais i){
        this.hasSpecial = false;
    }
    public boolean hasSpecial(){
        return this.hasSpecial;
    }
    
}

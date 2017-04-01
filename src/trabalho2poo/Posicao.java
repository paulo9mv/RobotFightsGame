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
    
    private Arma arma;
    private Virus virus;
    private Bomba bomba;
    
    private int type;
    
    public int x, y, z;
    
    public Posicao(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        
        hasSpecial = false;
    }
    public Posicao(int x, int y, int z, Arma a){
        this.x = x;
        this.y = y;
        this.z = z;
        
        this.hasSpecial = true;
        this.arma = a;
        this.type = TYPE_ARMA;
    }
    public Posicao(int x, int y, int z, Bomba b){
        this.x = x;
        this.y = y;
        this.z = z;
        
        this.hasSpecial = true;
        this.bomba = b;
        this.type = TYPE_BOMBA;
    }
    public Posicao(int x, int y, int z, Virus v){
        this.x = x;
        this.y = y;
        this.z = z;
        
        this.hasSpecial = true;
        this.virus = v;
        this.type = TYPE_VIRUS;
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
    
}

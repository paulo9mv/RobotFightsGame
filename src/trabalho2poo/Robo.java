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
public class Robo {
    public static final int TAURUS_ID = 1;
    public static final int SANDROCK_ID = 2;
    public static final int EPYON_ID = 3;
    public static final int ALTRON_ID = 4;
    public static final int VIRGO_ID = 5;
    
    public static final String TAURUS_NAME = "Taurus";
    public static final int TAURUS_HP = 3000;
    public static final int TAURUS_ARMOR = 200;
    public static final String SANDROCK_NAME = "Sandrock";
    public static final int SANDROCK_HP = 5500;
    public static final int SANDROCK_ARMOR = 55;
    public static final String EPYON_NAME = "Epyon";
    public static final int EPYON_HP = 2700;
    public static final int EPYON_ARMOR = 250;
    public static final String ALTRON_NAME = "Altron";
    public static final int ALTRON_HP = 2200;
    public static final int ALTRON_ARMOR = 230;
    public static final String VIRGO_NAME = "Virgo";
    public static final int VIRGO_HP = 4100;
    public static final int VIRGO_ARMOR = 120;
    
    private String name;
    private String player;
    private int hp;
    private int armor;
    private Arma arma;
    private Point3D posicaoAtual = new Point3D();
    
    public Point3D getPosicaoAtual(){
        return this.posicaoAtual;
    }
    public String getPlayer(){
        return this.player;
    }
    public void setPosicaoAtual(int x, int y, int z){
        this.posicaoAtual.x = x;
        this.posicaoAtual.y = y;
        this.posicaoAtual.z = z;
    }
    public Robo(String name, int hp, int armor){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
    }
    public void setPlayerName(String nome){
        this.player = nome;
    }
    public void setArma(Arma a){
        this.arma = a;
    }
    public String getName(){
        return this.name;
    }

}

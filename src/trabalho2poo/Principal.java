/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2poo;

import java.util.Scanner;

/**
 *
 * @author Paulo Vitor
 */
public class Principal {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Jogador 1, escolha seu robo e sua arma:\n");
        menuRobo();
        int robo1 = scan.nextInt();
        menuArma();
        int arma1 = scan.nextInt();
        
        Robo jogador1 = null;
        Robo jogador2 = null;
        
        switch(robo1){
            case Robo.ALTRON_ID:
                jogador1 = new Robo(Robo.ALTRON_NAME, Robo.ALTRON_HP, Robo.ALTRON_ARMOR);
                break;
            case Robo.SANDROCK_ID:
                jogador1 = new Robo(Robo.SANDROCK_NAME, Robo.SANDROCK_HP, Robo.SANDROCK_ARMOR);
                break;
            case Robo.EPYON_ID:
                jogador1 = new Robo(Robo.EPYON_NAME, Robo.EPYON_HP, Robo.EPYON_ARMOR);
                break;
            case Robo.TAURUS_ID:
                jogador1 = new Robo(Robo.TAURUS_NAME, Robo.TAURUS_HP, Robo.TAURUS_ARMOR);
                break;
            case Robo.VIRGO_ID:
                jogador1 = new Robo(Robo.VIRGO_NAME, Robo.VIRGO_HP, Robo.VIRGO_ARMOR);
                break;
        }
        switch(arma1){
            case Arma.GAUSSCANNON_ID:
                jogador1.setArma(new Arma(Arma.GAUSSCANNON, Arma.GAUSSCANNON_DAMAGE));
                break;
            case Arma.MISSILES_ID:
                jogador1.setArma(new Arma(Arma.MISSILES, Arma.MISSILES_DAMAGE));
                break;
            case Arma.SHOCKCANNON_ID:
                jogador1.setArma(new Arma(Arma.SHOCKCANNON, Arma.SHOCKCANNON_DAMAGE));
                break;
            case Arma.RAILGUN_ID:
                jogador1.setArma(new Arma(Arma.RAILGUN, Arma.RAILGUN_DAMAGE));
                break;
            case Arma.LASERCANNON_ID:
                jogador1.setArma(new Arma(Arma.LASERCANNON, Arma.LASERCANNON_DAMAGE));
                break;
        }
        
        jogador1.setPlayerName("Paulo");
        System.out.printf("Jogador 2, escolha seu robo e sua arma:\n");
        menuRobo();
        int robo2 = scan.nextInt();
        menuArma();
        int arma2 = scan.nextInt();
        
        switch(robo2){
            case Robo.ALTRON_ID:
                jogador2 = new Robo(Robo.ALTRON_NAME, Robo.ALTRON_HP, Robo.ALTRON_ARMOR);
                break;
            case Robo.SANDROCK_ID:
                jogador2 = new Robo(Robo.SANDROCK_NAME, Robo.SANDROCK_HP, Robo.SANDROCK_ARMOR);
                break;
            case Robo.EPYON_ID:
                jogador2 = new Robo(Robo.EPYON_NAME, Robo.EPYON_HP, Robo.EPYON_ARMOR);
                break;
            case Robo.TAURUS_ID:
                jogador2 = new Robo(Robo.TAURUS_NAME, Robo.TAURUS_HP, Robo.TAURUS_ARMOR);
                break;
            case Robo.VIRGO_ID:
                jogador2 = new Robo(Robo.VIRGO_NAME, Robo.VIRGO_HP, Robo.VIRGO_ARMOR);
                break;
        }
        switch(arma2){
            case Arma.GAUSSCANNON_ID:
                jogador2.setArma(new Arma(Arma.GAUSSCANNON, Arma.GAUSSCANNON_DAMAGE));
                break;
            case Arma.MISSILES_ID:
                jogador2.setArma(new Arma(Arma.MISSILES, Arma.MISSILES_DAMAGE));
                break;
            case Arma.SHOCKCANNON_ID:
                jogador2.setArma(new Arma(Arma.SHOCKCANNON, Arma.SHOCKCANNON_DAMAGE));
                break;
            case Arma.RAILGUN_ID:
                jogador2.setArma(new Arma(Arma.RAILGUN, Arma.RAILGUN_DAMAGE));
                break;
            case Arma.LASERCANNON_ID:
                jogador2.setArma(new Arma(Arma.LASERCANNON, Arma.LASERCANNON_DAMAGE));
                break;
        }
        
        jogador2.setPlayerName("jiko10");
        int comprimento = 5, largura = 5, altura = 5;
        
        Arena arena = new Arena(comprimento, largura, altura);
        arena.startPlayers(jogador1, jogador2);
        Acao a = new Acao(arena.getArena());
        
        /*while(!a.isGameOver()){
            a.turn(jogador1);
            a.turn(jogador2);
        }*/
        
        System.out.println(jogador1.getName());
        System.out.println(jogador2.getName());
        
        
    }
    public static void menuRobo(){
        System.out.printf("Robôs:\n1 - TAURUS (HP: %d, ARMOR: %d)\n"
                            + "2 - SANDROCK (HP: %d, ARMOR: %d)\n"
                            + "3 - EPYON (HP: %d, ARMOR: %d)\n"
                            + "4 - ALTRON (HP: %d, ARMOR: %d)\n"
                            + "5 - VIRGO (HP: %d, ARMOR: %d)\n",Robo.TAURUS_HP, Robo.TAURUS_ARMOR,
                                                                Robo.SANDROCK_HP, Robo.SANDROCK_ARMOR,
                                                                Robo.EPYON_HP, Robo.EPYON_ARMOR,
                                                                Robo.ALTRON_HP, Robo.ALTRON_ARMOR,
                                                                Robo.VIRGO_HP, Robo.VIRGO_ARMOR);
    }
    public static void menuArma(){
        System.out.printf("Armas:\n1 - %s (Dano: %d)\n"
                + "2 - %s (Dano: %d)\n"
                + "3 - %s (Dano: %d)\n"
                + "4 - %s (Dano: %d)\n"
                + "5 - %s (Dano: %d)\n", Arma.LASERCANNON, Arma.LASERCANNON_DAMAGE,
                                         Arma.MISSILES, Arma.MISSILES_DAMAGE,
                                         Arma.GAUSSCANNON, Arma.GAUSSCANNON_DAMAGE,
                                         Arma.SHOCKCANNON, Arma.SHOCKCANNON_DAMAGE,
                                         Arma.RAILGUN, Arma.RAILGUN_DAMAGE);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paulo Vitor
 */
public class Acao {
    private final int FRENTE = 1;
    private final int TRAS = 2;
    private final int CIMA = 3;
    private final int BAIXO = 4;
    private final int ESQUERDA = 5;
    private final int DIREITA = 6;
    
    ArrayList<ArrayList<ArrayList<Posicao>>> listaPosicoes;
    private boolean gameOver = false;
    private int turno = 0;
    private int contaTurno = 0;
    
    public Acao(ArrayList<ArrayList<ArrayList<Posicao>>> p){
        this.listaPosicoes = p;
    }
    
    public boolean isGameOver(){
        return this.gameOver;
    }
    private Posicao getPosicao(int i, int j, int k){
        return listaPosicoes.get(i).get(j).get(k);
    }
    private void mover(Robo r1, int mov){
        int x = r1.getPosicaoAtual().x;
        int y = r1.getPosicaoAtual().y;
        int z = r1.getPosicaoAtual().z;
        try{
        switch(mov){ 
            case FRENTE:
                this.getPosicao(x,y,z).removeRobot();
                this.getPosicao(x,y+1,z).setRobot(r1);
                r1.setPosicaoAtual(x, y+1, z);
                break;
            case TRAS:
                this.getPosicao(x,y,z).removeRobot();
                this.getPosicao(x,y-1,z).setRobot(r1);
                r1.setPosicaoAtual(x, y-1, z);
                break;
            case CIMA:
                this.getPosicao(x,y,z).removeRobot();
                this.getPosicao(x,y,z+1).setRobot(r1);
                r1.setPosicaoAtual(x, y, z+1);
                break;
            case BAIXO:
                this.getPosicao(x,y,z).removeRobot();
                this.getPosicao(x,y,z-1).setRobot(r1);
                r1.setPosicaoAtual(x, y, z-1);
                break;
            case ESQUERDA:
                this.getPosicao(x, y, z).removeRobot();
                this.getPosicao(x-1, y, z).setRobot(r1);
                r1.setPosicaoAtual(x-1, y, z);
                break;
            case DIREITA:
                this.getPosicao(x,y,z).removeRobot();
                this.getPosicao(x+1, y, z).setRobot(r1);
                r1.setPosicaoAtual(x+1, y, z);
                break;
        }
            if(this.getPosicao(r1.getPosicaoAtual().x, r1.getPosicaoAtual().y, r1.getPosicaoAtual().z).hasSpecial()){
                
            }
        }catch(Exception e){
            System.out.println("Você caiu da arena. Voltando a posição original\nVocê não pode se mover nesse turno.");
        }
    }
    public void turn(Robo r1){
        contaTurno++;
        
        Scanner scan = new Scanner(System.in);
        msgMovimento(r1);
        int mov = scan.nextInt();
        mover(r1, mov);
        
        if(contaTurno == 2){
            this.turno++;
            this.contaTurno = 0;
        }
    }
    private void msgMovimento(Robo r1){
        System.out.printf("%s, você está na posição %d %d %d.\nRobô %s. HP: %d.\n", r1.getPlayer(), r1.getPosicaoAtual().x, r1.getPosicaoAtual().y, r1.getPosicaoAtual().z);
        System.out.printf("Mover: 1-Frente 2-Trás 3-Cima 4-Baixo 5-Esquerda 6-Direita\n");
    }
}

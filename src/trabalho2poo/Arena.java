/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2poo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paulo Vitor
 */
public class Arena {
    int comprimento, largura, altura;
    private ArrayList<ArrayList<ArrayList<Posicao>>> listaPosicoes = new ArrayList<ArrayList<ArrayList<Posicao>>>();
    
    private Random mRandom = new Random();
    
    public ArrayList<ArrayList<ArrayList<Posicao>>> getArena(){
        return this.listaPosicoes;
    }
    public Arena(int comprimento, int largura, int altura){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.startArena();
    }
    private void startArena(){
        int i, j, k;
               
        for( i = 0; i < comprimento; i++){
            ArrayList<ArrayList<Posicao>> p2 = new ArrayList<ArrayList<Posicao>>();
            for( j = 0; j < largura; j++){
                ArrayList<Posicao> p = new ArrayList<Posicao>();
                for( k = 0; k < altura; k++){
                    p.add(setPosition(i,j,k));          
                }
                p2.add(p);             
            }
            listaPosicoes.add(p2);  
        }
        msg();
    }
    public void startPlayers(Robo r1, Robo r2){
        listaPosicoes.get(0).get(0).get(0).setRobot(r1);
        r1.setPosicaoAtual(0,0,0);
        listaPosicoes.get(comprimento-1).get(largura-1).get(altura-1).setRobot(r2);
        r2.setPosicaoAtual(comprimento-1, largura-1, altura-1);
    }
    private void msg(){
        int i, j, k;
        for( i = 0; i < comprimento; i++)
            for( j = 0; j < largura; j++)
                for( k = 0; k < altura; k++)
                    if(listaPosicoes.get(i).get(j).get(k).hasSpecial())
                        System.out.printf("Posicao %d %d %d possui: %s\n",i,j,k, listaPosicoes.get(i).get(j).get(k).getName());
    }
    private Posicao setPosition(int i, int j, int k){
        Posicao p = null;
        if(mRandom.nextInt(100) < 10){
            int decisaoSpecial = mRandom.nextInt(3);
            switch(decisaoSpecial){
                case Posicao.TYPE_ARMA:
                    p = new Posicao(i, j, k, new Arma());
                    break;
                case Posicao.TYPE_BOMBA:
                    p = new Posicao(i, j, k, new Bomba());
                    break;
                case Posicao.TYPE_VIRUS:
                    p = new Posicao(i ,j ,k, new Virus());
                    break;
            }
        }
        else{
            p = new Posicao(i, j, k);
        }
        return p;
    }
    
    
        
}


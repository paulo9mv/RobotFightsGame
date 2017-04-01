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
    int dimensoes[][][];
    int comprimento, largura, altura;
    ArrayList<ArrayList<ArrayList<Posicao>>> listaPosicoes = new ArrayList<ArrayList<ArrayList<Posicao>>>();
    
    private Random mRandom = new Random();
    public ItensEspeciais item = new ItensEspeciais();
    
    public Arena(int comprimento, int largura, int altura){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.startArena();
    }
    private void startArena(){
        for(int i = 0; i < comprimento; i++)
            for(int j = 0; j < largura; j++)
                for(int k = 0; k < altura; k++){
                    setPosition(listaPosicoes.get(i).get(j).get(k), i ,j ,k);
                }
    }
    private void setPosition(Posicao p, int i, int j, int k){
        if(mRandom.nextInt(100) < 5){
            int decisaoSpecial = mRandom.nextInt(3);
            switch(decisaoSpecial){
                case Posicao.TYPE_ARMA:
                    p = new Posicao(i, j, k, item.armaAleatoria());
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
    }
    
}

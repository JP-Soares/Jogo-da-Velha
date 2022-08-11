/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

/**
 *
 * @author pedro
 */
public class Jogo {
    //Dados do jogador
    private String nomeJogador1;
    private String nomeJogador2;
    
    //Dados do jogo
    private String vezJogada = "j1";
    private int numJogadas = 0;
    
    //private int [] jogada = new int[8];
    
    private int placar1 = 0;
    private int placar2 = 0;

    public int getPlacar1() {
        return placar1;
    }

    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    public int getPlacar2() {
        return placar2;
    }

    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    public String getNomeJogador1() {
        return nomeJogador1;
    }

    public void setNomeJogador1(String nomeJogador1) {
        this.nomeJogador1 = nomeJogador1;
    }

    public String getNomeJogador2() {
        return nomeJogador2;
    }

    public void setNomeJogador2(String nomeJogador2) {
        this.nomeJogador2 = nomeJogador2;
    }

    public String getVezJogada() {
        return vezJogada;
    }

    public void setVezJogada(String vezJogada) {
        this.vezJogada = vezJogada;
    }

    public int getNumJogadas() {
        return numJogadas;
    }

    public void setNumJogadas(int numJogadas) {
        this.numJogadas = numJogadas;
    }

    /*public int[] getJogada() {
        return jogada;
    }

    public void setJogada(int[] jogada) {
        this.jogada = jogada;
    }*/
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvorebinaria;

/**
 *
 * @author yllan.gurgel
 */
public class No {
    
    private int valor;
    private No esquerda;
    private No direita;
    
    public No(){
    
    }
    
    public No(int valor) {
        this.valor = valor;
    }

    public No(int valor, No esquerda, No direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }


    /**
     * @return the esquerda
     */
    public No getEsquerda() {
        return esquerda;
    }

    /**
     * @param esquerda the esquerda to set
     */
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * @return the direita
     */
    public No getDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(No direita) {
        this.direita = direita;
    }
    
}

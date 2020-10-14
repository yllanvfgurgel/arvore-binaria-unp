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
public class ArvoreBinaria {
 
    private No raiz;

    /**
     * @return the raiz
     */
    public No getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    
    public boolean isEmpty() {
        return (this.raiz == null);
    }
    
    public No inserir(int valor) {
        
        return inserir(new No(valor), this.getRaiz());
        
    }
    
    public No inserir(No folha, No raizFolha) {
        
        if(this.getRaiz() == null) {
            this.setRaiz(folha);
            return folha;
        } 
            if(raizFolha != null) {
                if(folha.getValor() < raizFolha.getValor()) {
                    raizFolha.setEsquerda(inserir(folha, raizFolha.getEsquerda()));
                } else {
                    if (folha.getValor() > raizFolha.getValor()) {
                        raizFolha.setDireita(inserir(folha, raizFolha.getDireita()));
                    } else {
                        return null;
                    }
                }
            } else {
                raizFolha = folha;
            }
        
       return folha;
        
    }
    
    
//    public int buscarNo(int valor) {
//        
//        int contPassos = 0;
//        
//    }
    
}

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
    
    public void inserir(int valor) {
        
        No n = new No(valor);
        inserirArvore(n, this.getRaiz());
        
    }
    
    public void inserirArvore(No folha, No raizFolha) {
        
        if(raizFolha == null) {
            this.setRaiz(folha);
        } 
            if(raizFolha != null) {
                if(folha.getValor() < raizFolha.getValor()) {
                    if(raizFolha.getEsquerda() == null) {
                        raizFolha.setEsquerda(folha);
                    } else {
                        inserirArvore(folha, raizFolha.getEsquerda());
                    }
                } else {
                    if(raizFolha.getDireita() == null) {
                        raizFolha.setDireita(folha);
                    } else {
                        inserirArvore(folha, raizFolha.getDireita());
                    }
                }
            }
    }
                        
                        
        
        
    
    
//    public int buscarNo(int valor) {
//        
//        int contPassos = 0;
//        
//    }
    
}

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
public class Teste {
    
    public static void main(String[] args) {
        
        ArvoreBinaria ab = new ArvoreBinaria();
        ab.inserir(5);
        ab.inserir(7);
        ab.inserir(3);
        
        System.out.println(ab.getRaiz().getValor());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvorebinaria;

import java.util.Scanner;

/**
 *
 * @author yllan.gurgel
 */
public class Teste {
    
    public static void main(String[] args) {
        
        ArvoreBinaria ab = new ArvoreBinaria();
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Digite a quantidade de elementos da árvore: ");
        int qtd = leia.nextInt();
        
        System.out.println(ab.getRaiz().getValor());
        
    }
    
}

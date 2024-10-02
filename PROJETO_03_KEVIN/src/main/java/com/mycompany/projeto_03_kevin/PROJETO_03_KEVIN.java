/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_03_kevin;

/**
 *
 * @author kevin
 */
public class PROJETO_03_KEVIN {

    public static void main(String[] args) {
        int[] num_par = new int[50];
        int i;
        int c = 0;
        
        // Preenche o vetor.
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                num_par[c] = i;
                c++;
            }
        }
        
        // Escreve o vetor na tela.
        for (i = 0; i < num_par.length; i++) {
            System.out.print(num_par[i]);
            if (i < num_par.length - 1) {
                System.out.print(", ");
            }
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_04_kevin;

/**
 *
 * @author kevin
 */
public class PROJETO_04_KEVIN {

    public static void main(String[] args) {
        int[] num = new int[10];
        int i;
        int c = 0;
        
        // Preenche o vetor com a sequencia de fibonacci.
        for (i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                num[c] = i * i;
                c++;
            }
        }
        
        // Escreve o vetor na tela.
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

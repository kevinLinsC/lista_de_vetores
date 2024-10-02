/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_01_kevin;

/**
 *
 * @author kevin
 */
public class PROJETO_01_KEVIN {

    public static void main(String[] args) {
        int[] num = new int[51];
        int i;
        
        // Preenche o vetor.
        for (i = 0; i <= 50; i++) {
            num[i] = i;
        }
        
        // Escreve o vetor na tela.
        for (i = 0; i <= 50; i++) {
            System.out.print(num[i]);
            if (i < 50) {
                System.out.print(", ");
            }
        }
    }
}

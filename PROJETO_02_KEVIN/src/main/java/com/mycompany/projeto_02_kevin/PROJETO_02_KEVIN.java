/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_02_kevin;

/**
 *
 * @author kevin
 */
public class PROJETO_02_KEVIN {

    public static void main(String[] args) {
        int[] num = new int[101];
        
        int i;
        
        // Preenche o vetor.
        for (i = 100; i >= 1; i--) {
            num[i] = i;
        }
        
        // Escreve o vetor na tela.
        for (i = 100; i >= 1; i--) {
            System.out.print(num[i]);
            if (i > 1) {
                System.out.print(", ");
            }
        }
    }
}

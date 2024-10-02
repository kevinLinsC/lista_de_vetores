/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_10_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_10_KEVIN {

    public static void main(String[] args) throws IOException {
        int[] num = new int[20];
        int i;
        int menor;
        int posicao = 0;
        
        // Preenche o vetor.
        for (i = 0; i < num.length; i++) {
            num[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        menor = num[0];
        
        // Pega o menor numero.
        for (i = 0; i < num.length; i++) {
            if (num[i] < menor) {
                menor = num[i];
                posicao = i + 1;
            }
            
        }
        
        Linha();
        
        System.out.println("O menor numero digitado foi: " + menor);
        System.out.println("Na posicao: " + posicao);
    }
    
    // Trata o erro de input.
    public static int PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        int num;
        
        // Usuario não sai enquanto não digitar um numero inteiro.
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            try {
                num = Integer.parseInt(s);
                if (num > 0) {
                    break;
                }
                else {
                    System.out.println("ERRO! Digite somente numeros positivos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERRO! Digite um numero inteiro.");
            }
        }
        
        return num;
    }
    
    // Escreve uma linha
    public static void Linha() {
        System.out.println("-------------------------------------");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_11_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_11_KEVIN {

    public static void main(String[] args) throws IOException {
        int A[] = new int[10];
        int M[] = new int[10];
        int X;
        int i;
        
        // Pega os numeros.
        for (i = 0; i < A.length; i++) {
            A[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        Linha();
        X = PegaNum("Digite um numero para multiplicar os numeros acima: ");
        Linha();
        
        // Preenche o vetor com os numeros multiplicados.
        for (i = 0; i < A.length; i++) {
            M[i] = A[i] * X;
            System.out.print(M[i] + "");
            if (i < A.length - 1) {
                System.out.print(", ");
            }
        }
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
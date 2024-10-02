/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_09_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_09_KEVIN {

    public static void main(String[] args) throws IOException {
        int[] num = new int[20];
        int i;
        int maior = 0;
        int posicao = 0;
        
        // Preenche o vetor.
        for (i = 0; i < num.length; i++) {
            num[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        // Pega o maior numero.
        for (i = 0; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
                posicao = i + 1;
            }
            
        }
        
        Linha();
        
        System.out.println("O maior numero digitado foi: " + maior);
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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_12_KEVIN {

    public static void main(String[] args) throws IOException {
        int i;
        int num[] = new int[20];
        
        for (i = 0; i < num.length; i++) {
            num[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        Linha();
        System.out.println("Os numeros na ordem contraria: ");
        
        for (i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i > 0) {
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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_05_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_05_KEVIN {

    public static void main(String[] args) throws IOException {
        float[] num = new float[10];
        int i;
        
        // Preenche o vetor com os numeros e divide na metade.
        for (i = 0; i < 10; i++) {
            num[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
            num[i] = num[i] / 2;
        }
        
        Linha();
        
        // Escreve o vetor.
        for (i = 0; i < 10; i++) {
            System.out.println((i + 1) + " numero: " + num[i]);
        }
    }
    
    // Trata o erro de input.
    public static float PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        float num;
        
        // Usuario não sai enquanto não digitar um numero inteiro.
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            try {
                num = Float.parseFloat(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO! Digite um numero inteiro.");
            }
        }
        
        return num;
    }
    
    public static void Linha() {
        System.out.println("-------------------------------------");
    }
}

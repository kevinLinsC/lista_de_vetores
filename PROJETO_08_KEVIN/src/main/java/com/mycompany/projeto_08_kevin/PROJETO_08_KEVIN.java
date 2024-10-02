/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_08_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_08_KEVIN {

    public static void main(String[] args) throws IOException {
        float[] notas = new float[20];
        float media = 0;
        int i;
        
        // Pega as notas e soma na media.
        for (i = 0; i < notas.length; i++) {
            notas[i] = PegaNota("Escreva a nota do " + (i + 1) + " aluno: ");
            media += notas[i];
        }
        
        Linha();
        media = media / notas.length; // Faz o calculo da media.
        System.out.println("A media da turma e: " + media);
        Linha();
        
        // Verifica quais alunos estão acima da media.
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("O aluno " + (i + 1) + " esta acima da media.");
            }
        }
    }
    
    // Trata o erro de input.
    public static float PegaNota(String texto) throws IOException {
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

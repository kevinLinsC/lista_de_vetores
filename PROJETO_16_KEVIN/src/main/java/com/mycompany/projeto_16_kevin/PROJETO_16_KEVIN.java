/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_16_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_16_KEVIN {

    public static void main(String[] args) throws IOException {
        int limite = 4;
        int[] pri_vetor = new int[limite];
        int[] seg_vetor = new int[limite];
        
        int cont_num_mesma_pos = 0;
        
        System.out.println("Preencha o primeiro vetor: ");
        Linha();
        for (int i = 0; i < limite; i++) {
            pri_vetor[i] = PegaNum((i + 1) + " posicao: ");
        }
        
        Linha();
        System.out.println("Preencha o segundo vetor: ");
        for (int i = 0; i < limite; i++) {
            seg_vetor[i] = PegaNum((i + 1) + " posicao: ");
        }
        
        for (int i = 0; i < limite; i++) {
            if (pri_vetor[i] == seg_vetor[i]) {
                cont_num_mesma_pos++;
            }
        }
        
        Linha();
        System.out.println("Quantidade de vezes que um numero na mesma posicao e igual aparecem: " + cont_num_mesma_pos + " vezes.");
    } 
    
    public static int PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        int num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                num = Integer.parseInt(s);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Digite somente numeros.");
                Linha();
            }
        }
        
        return num;
    }
    
    public static void Linha() {
        System.out.println("----------------------------------------");
    }
}

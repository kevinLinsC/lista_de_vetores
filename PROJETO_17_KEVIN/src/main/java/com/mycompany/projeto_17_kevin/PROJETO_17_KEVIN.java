/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_17_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_17_KEVIN {

    public static void main(String[] args) throws IOException {
        int limite = 30;
        int[] numeros = new int[limite];
        int num_buscado;
        int qtd_num = 0;
        
        for (int i = 0; i < limite; i++) {
            numeros[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        Linha();
        num_buscado = PegaNum("Digite um numero para ser buscado: ");
        
        for (int i = 0; i < limite; i++) {
            if (numeros[i] == num_buscado) {
                qtd_num++;
            }
        }
        
        Linha();
        System.out.println("O numero " + num_buscado + " aparece: " + qtd_num + " vezes");
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

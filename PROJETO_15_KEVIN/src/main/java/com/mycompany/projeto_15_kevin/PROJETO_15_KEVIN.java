/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_15_KEVIN {

    public static void main(String[] args) throws IOException {
        int limite = 20;
        int[] numeros = new int[limite];
        int num_verif;
        boolean encontrado = false;
        
        for (int i = 0; i < limite; i++) {
            numeros[i] = PegaNum("Digite o numero " + (i + 1) + ": ");
        }
        Linha();
        num_verif = PegaNum("Digite um numero para ser verificado: ");
        Linha();
        
        for (int i = 0; i < limite; i++) {
            if (numeros[i] == num_verif) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            int c = 0;
            int[] numeros_novo = new int[19];
            for (int i = 0; i < limite; i++) {
                if (numeros[i] != num_verif) {
                    numeros_novo[c] = numeros[i];
                    c++;
                }
            }
            
            System.out.println("Novos numeros(sem " + num_verif + "): ");
            for (int i = 0; i < limite - 1; i++) {
                System.out.println(numeros_novo[i] + " ");
            }
        }
        else {
            System.out.println("O numero " + num_verif + " nao esta presente no vetor.");
        }
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

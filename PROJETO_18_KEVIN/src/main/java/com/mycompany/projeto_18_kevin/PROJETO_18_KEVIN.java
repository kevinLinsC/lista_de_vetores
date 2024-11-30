/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_18_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_18_KEVIN {

    public static void main(String[] args) throws IOException {
        int limite = 5;
        int VET[] = new int[limite];
        boolean repetido = false;
        
        for (int i = 0; i < limite; i++) {
            VET[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        
        for (int i = 0; i < limite; i++) {
            for (int j = i + 1; j < limite; j++) {
                if (VET[i] == VET[j]) {
                    if (repetido == false) {
                        Linha();
                        System.out.println("Numero repetido na posicao: ");
                        repetido = true;
                    }
                    System.out.println("Numero " + VET[i] + " nas posicoes " + (i + 1) + " e " + (j + 1));
                }
            }
        }
        if (repetido == false) {
            System.out.println("Nao ha numeros repetidos.");
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

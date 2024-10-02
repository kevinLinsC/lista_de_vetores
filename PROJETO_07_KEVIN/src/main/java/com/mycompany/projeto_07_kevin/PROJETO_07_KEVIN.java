/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_07_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_07_KEVIN {

    public static void main(String[] args) throws IOException {
        String[] nomes = new String[10];
        String outro_nome;
        boolean encontrado = false;
        int i;
        
        // Pede ao usuario nomes para preencher o vetor.
        for (i = 0; i < nomes.length; i++) {
            nomes[i] = PegaNome("Digite o " + (i + 1) + " nome: ");
        }
        
        Linha();
        
        outro_nome = PegaNome("Digite um nome para buscar no vetor: ");
        
        for (i = 0; i < nomes.length; i++) {
            if (outro_nome.equals(nomes[i])) {
                encontrado = true;
                break;
            }
        }
        
        Linha();
        
        if (encontrado) {
            System.out.println("Achei o nome '" + outro_nome + "' na posicao '" + (i + 1) + "'.");
        }
        else {
            System.out.println("Nao achei o nome no vetor.");
        }
    }
    
    // Trata o erro de input.
    public static String PegaNome(String texto) throws IOException {
        DataInputStream dado;
        String s;
        
        // Pega uma string.
        System.out.print(texto);
        dado = new DataInputStream(System.in);
        s = dado.readLine();

        return s;
    }
    
    public static void Linha() {
        System.out.println("-------------------------------------");
    }
}

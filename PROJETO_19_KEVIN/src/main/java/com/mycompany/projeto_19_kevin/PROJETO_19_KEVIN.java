/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_19_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_19_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        
        int grupo = 4;

        String[] nomes = new String[grupo];
        double[] alturas = new double[grupo];
        double[] pesos = new double[grupo];
        char[] sexos = new char[grupo];
        
        int tot_homens = 0;
        int tot_mulheres = 0;
        double soma_pesos = 0;
        double maior_altura = 0;
        double mediaPeso = 0;
        double perc_homens = 0;
        double perc_mulheres = 0;
        String nome_maior_altura = "";

        dado = new DataInputStream(System.in);
        
        for (int i = 0; i < grupo; i++) {
            System.out.println("Digite as informacoes da pessoa " + (i + 1) + ": ");
            
            System.out.print("Nome: ");
            nomes[i] = dado.readLine();

            alturas[i] = PegaNum("Altura (Metros): ");

            pesos[i] = PegaNum("Peso (Kg): ");

            System.out.print("Sexo (F/M): ");
            sexos[i] = dado.readLine().toLowerCase().charAt(0);

            if (sexos[i] == 'm') {
                tot_homens++;
            } else if (sexos[i] == 'f') {
                tot_mulheres++;
            }

            soma_pesos += pesos[i];

            if (alturas[i] > maior_altura) {
                maior_altura = alturas[i];
                nome_maior_altura = nomes[i];
            }
            Linha();
        }

        mediaPeso = soma_pesos / grupo;
        perc_homens = (double) tot_homens / grupo * 100;
        perc_mulheres = (double) tot_mulheres / grupo * 100;

        Linha();
        System.out.println("Listagem com todas pessoas do grupo: ");
        for (int i = 0; i < grupo; i++) {
            System.out.printf("Nome: %s - Altura: %.2fm, Peso: %.2fkg, Sexo: %c", nomes[i], alturas[i], pesos[i], sexos[i]);
        }
        Linha();

        System.out.println("Total de homens no grupo: " + tot_homens + ".");
        System.out.println("Total de mulheres no grupo: " + tot_mulheres + ".");
        System.out.printf("Percentual de homens: %.2f", perc_homens);
        System.out.printf("\nPercentual de mulheres: %.2f", perc_mulheres);
        System.out.printf("\nMédia de Peso das Pessoas: %.2f Kg", mediaPeso);
        System.out.println("\n" + nome_maior_altura + " e o maior do grupo com " + maior_altura + " metros." + ".");
    }
    
    public static double PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        double num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                num = Double.parseDouble(s);
                if (num < 0) {
                    System.out.println("Digite um numero valido.");
                }
                else {
                    break;
                }
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

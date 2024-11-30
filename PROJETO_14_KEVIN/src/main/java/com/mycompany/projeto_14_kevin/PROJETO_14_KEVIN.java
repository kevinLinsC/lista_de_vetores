/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author kevin
 */
public class PROJETO_14_KEVIN {

    public static void main(String[] args) throws IOException {
        int dias = 5;
        float menor_temp;
        float maior_temp;
        float media_temp = 0;
        int qtd_dias_infer_media = 0;
        
        float[] temps = new float[dias];
        
        for (int i = 0; i < dias; i++) {
            temps[i] = PegaTemp("Digite a temperatura media do dia " + (i + 1) + ": ");
        }
        
        menor_temp = temps[0];
        maior_temp = temps[0];
        
        for (int i = 0; i < dias; i++) {
            if (temps[i] < menor_temp) {
                menor_temp = temps[i];
            }
            if (temps[i] > maior_temp) {
                maior_temp = temps[i];
            }
            
            media_temp += temps[i];
        }
        
        media_temp = media_temp / dias;
        
        for (int i = 0; i < dias; i++) {
            if (temps[i] < media_temp) {
                qtd_dias_infer_media++;
            }
        }
        
        Linha();
        
        System.out.println("Menor temperatura do ano: " + menor_temp + "C");
        System.out.println("Maior temperatura do ano: " + maior_temp + "C");
        System.out.println("Temperatura media anual: " + media_temp + "C");
        System.out.println("Soma de dias com temperatura inferior a média: " + qtd_dias_infer_media);
        
    }
    
    public static float PegaTemp(String texto) throws IOException {
        DataInputStream dado;
        String s;
        float num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                num = Float.parseFloat(s);
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

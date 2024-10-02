/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_06_kevin;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class PROJETO_06_KEVIN {

    public static void main(String[] args) {
        int[] v = {5, 1, 4, 2, 7, 8, 3, 6};
        int aux;
        for (int i = 7; i >= 4; i--) {
            aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }
        
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        System.out.println(Arrays.toString(v));
    }
}

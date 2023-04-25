package com.hedima.presentacion;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner s1 = new Scanner(System.in);

        String[] palabras;

        Set<String> diferentes= new HashSet<>();

        String texto;
        //Solicitar frase
        System.out.println("Escriba un texto para analizar -> ");
        texto = s1.nextLine();

        palabras = texto.split(" ");
        for (String elemento : palabras) {
            if (elemento.trim().length()>0){
                diferentes.add(elemento.trim().toLowerCase());
            }
        }
        System.out.println("Palabras diferentes -> ");
        for (String elemento : diferentes) {
            System.out.print(elemento +",");
        }
        System.out.println("¿Cuantas palabras diferentes hay?" + diferentes.size());
        System.out.println("¿Cuantas palabras tiene la frase?" + palabras.length);
    }
}
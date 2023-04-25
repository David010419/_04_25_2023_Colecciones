package com.hedima.presentacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioArray {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};

            System.out.println("Array" + Arrays.toString(a));

            List<Integer> a1 = new ArrayList<>();

            for (int i = 1; i < 10; i++) {
                a1.add(i);
            }

        System.out.println("List " +a1);
//Ejercicio Claudio
//        int[] a1= new int[10];
//        for (int i = 0; i <10;i++){
//            a1[i] =i;
//        }
//        List lista=new ArrayList();
//        for (int j = 0; j <10;j++){
//            lista.add(j);
//        }
//        System.out.println(Arrays.toString(a1));
//        System.out.println(lista);

    }
}

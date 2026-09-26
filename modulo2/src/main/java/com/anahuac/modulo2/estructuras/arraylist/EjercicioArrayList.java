package com.anahuac.modulo2.estructuras.arraylist;

import java.util.ArrayList;

public class EjercicioArrayList {


    public static void main(String [] args) {
        // int [] numbers = new int []
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        //agregar datos
        num.add(3);
        num.add( 200);
        num.add(500);
        
        for (int i=0 ; i < num.size(); i++) {
            System.out.println("Num:" + num.get(i));
        }
          
        for (Integer numero : num) {
            System.out.println("Num:" + num);
        }
    }
}

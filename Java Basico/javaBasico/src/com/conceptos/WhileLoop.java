package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        boolean check = true;

        int count = 0;
        while (count < 10){
            count++;
            if(count == 6)
                break; // rompe flujo de ejecucion
                continue; // salta el valor 6 y sigue con la iteracion
           // System.out.println("Hola mundo " + count);
        }
    }

}

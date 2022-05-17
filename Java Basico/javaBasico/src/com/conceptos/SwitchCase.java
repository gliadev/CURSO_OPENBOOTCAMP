package com.company;

public class SwitchCase {
    public static void main(String[] args) {
        String wheater = "sunny";

        switch (wheater){
            case "symmy":
                System.out.println("El tiempo es Soleado");
                break;
            case "soleado":
                System.out.println("Ahora esta soleado");
                break;
            default:
                System.out.println("No se encontro el tiempo");
                break;
        }
    }
}

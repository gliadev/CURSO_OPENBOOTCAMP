package com.company;

public class CocheMain {
    public static void main(String[] args) {


        String coche = "Alfa Romeo";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rojo", "Honda",
                "civic", 1430.50, 5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);
        cocheObj2.peso = 2000.0;
        System.out.println(cocheObj2);
    }
}

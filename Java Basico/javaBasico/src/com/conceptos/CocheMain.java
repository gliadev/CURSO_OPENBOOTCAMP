package com.conceptos;

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

        CocheElectrico cocheElectrico= new CocheElectrico();


        cocheElectrico.motorElectrico = "Ejemplo de motoro";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Ford";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("rojo","seat","almera",
                7.12,8.12,"bario");
    }
}

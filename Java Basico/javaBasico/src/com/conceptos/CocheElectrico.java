package com.conceptos;

// extends hace que herede de la clase coche las caracteristicas
public class CocheElectrico extends Coche{
    String motorElectrico;

    public CocheElectrico(){

    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,
                 String motroElectrico){
        super(color, fabricante, modelo,peso, largo);
        this.motorElectrico = motroElectrico;
    }



    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", Largo=" + Largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

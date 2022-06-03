package poo.clases;
/*
    clase base o superclase o clase padre
 */

public class Vehiculo {


        // 1. atributos
        protected String fabricante;
        protected String modelo;
        protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
        // hacemos un objeto motor lo ponemos aparte
        protected Motor motor;

        // 2. constructores
        public Vehiculo(){

        }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){
            this.fabricante = fabricante;
            this.modelo = modelo;

        }


        // 4. métodos ( comportamiento )

        public void acelerar(int quantity){
            // asignamos quantity a la velocidad
            this.speed += quantity;

        }

        // getter y setter
    // cuando aplicamos encapsulacion ponomos a private no son accesibles en otra clase


        //toString



    }


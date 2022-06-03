package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {


        // Clase intenficador = new Clase();

        // crear un objeto utilizando el constructor vacio
        Vehiculo ToyotaPrius = new Vehiculo();

        // crear un objeto utilizando el constructor con parámetros
        Motor motorGTI = new Motor("GTI", 190, 459.9, 6);

        Vehiculo fordMondeo = new Vehiculo("Ford", "mondeo",2.1,2010,false,0,motorGTI);
        System.out.println(fordMondeo.fabricante);

        System.out.println("la velocidad del Ford Mondeo es: " + fordMondeo.speed);
        fordMondeo.acelerar(50);
        fordMondeo.acelerar(50);
        System.out.println("la velocidad del Ford Mondeo es: " + fordMondeo.speed);

        // 2. herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "kawasaki";

        System.out.println("Fin del programa");

        // 3. poliformismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. clases abstraptas: no se pueden instanciar, solo se instacian
        //    las clases hijas



    }
}

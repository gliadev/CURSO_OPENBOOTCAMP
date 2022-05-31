package ejercicios.tema3;
/*

Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.


 */
public class EjerciciosTema3 {
    public static void main(String[] args) {

        suma(85, 25, 63);

        Coche nuevoCoche = new Coche();

        nuevoCoche.Puertas();
        nuevoCoche.Puertas();
        System.out.println("El numero de puertas es: " + nuevoCoche.numeroPuertas);

    }

    public static void suma(int a, int b, int c){

        int suma = a + b + c;
        System.out.println(suma);
    }
}

class Coche {
    public int numeroPuertas = 4;

    public void Puertas(){

        this.numeroPuertas++;
    }
}


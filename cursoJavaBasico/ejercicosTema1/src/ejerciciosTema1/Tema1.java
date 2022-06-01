package ejerciciosTema1;

public class Tema1 {
    public static void main(String[] args) {


     operaciones(25, 45.5);

     // para comparar
        int numero1 = 65;
        int numero2 = 65;

        //cojo los mumeros de arriba y los comparo igual, mayor, menor que..
        if(numero1>numero2){
            System.out.println( numero1 + " Es mayor que " + numero2);
        } else if (numero1 >= numero2) {
            System.out.println(numero1 + " Es = O > que "+ numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2 + " Es mayor que " + numero1);
        }



        // para operadorse logicos voy hacer una solicitud de carnet joven


    }

    public static void operaciones(int a, double b){

        System.out.println("La suma de " + a + " y " + b + " es: " + (a+b));
        System.out.println("La resta de " + a + " y " + b + " es: " + (a-b));
        System.out.println("La multiplicacion de " + a + " y " + b + " es: " + (a*b));
        System.out.println("La division de " + a + " y " + b + " es: " + (a/b));
        System.out.println("El resto de " + a + " y " + b + " es: " + (a%b));
    }






}

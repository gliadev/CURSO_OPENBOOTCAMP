/*
    Enunciado del ejercicio:

    Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

 */



package ejercicios.cursoJavaBasico.ejerciciosTema2;

public class ejercicosTema2 {
    public static void main(String[] args) {


        double producto1;
        double prodcuto2;
        int iva;
        System.out.println("El calculo con IVA es: " + precio(producto1=25.6, prodcuto2=85.8,iva=21));

    }

    public static double precio(double producto1, double producto2,int iva){
        double suma = producto1 + producto2;
        double cuenta = (suma * iva)/100;
        return cuenta;
       
    }




}

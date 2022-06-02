package ejercicios.cursoJavaBasico;
/*
    En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

    Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}

 */

public class ejerciciosTema3 {
    public static void main(String[] args) {

        String[] parrafo = new String[]{"hola","Buenos dias", "¿Que tal?"};

        for(int i = 0; i< parrafo.length; i++){
            System.out.println(parrafo[i]);
        }
    }
}

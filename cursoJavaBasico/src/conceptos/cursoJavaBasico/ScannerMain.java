package conceptos.cursoJavaBasico;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        System.out.println("hola imprime desde aqui");

        // para usar entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();


        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El numero introducido es; " + numero);
    }
}

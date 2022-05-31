package conceptos.cursoJavaBasico;

import java.util.ArrayList;
import java.util.List;

public class listMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();


        // con el medoto add puedo añadir los nombres que necesite
        // no tengo limite como en los arrays

        nombres.add("nombre1");
        nombres.add("nombre2");
        nombres.add("nombre3");
        nombres.add("nombre4");
        nombres.add("nombre5");
        nombres.add("nombre6");

        //puedo imprimirlo asi
        System.out.println(nombres);

        // para este tipo de arrys en vez de un for usamos un forech

        for (String nombre:nombres){
            System.out.println(nombre);
        }

       // List<Coche> coches = new ArrayList<>();
/*
        coches.add(new Coche("Honda Civis"));
        coches.add (new Coche("Alfa Romeo"));
        coches.add (new Coche("Ford Mondeo"));

        System.out.println(coches);*/

    }
}

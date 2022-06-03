package poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();

        Empleado Adolfo = new Empleado("Adolfo","Gomez Losada",22000,true);
        Empleado Pepe = new Empleado("Adolfo","Gomez Losada",22000,true);
        Empleado loco = new Empleado("Adolfo","Gomez Losada",22000,true);

        System.out.println(Pepe);

        empleadoCRUD.save(Adolfo);
        empleadoCRUD.save(Pepe);
        empleadoCRUD.save(loco);


        // consultar empleados
        List<Empleado> empleados= empleadoCRUD.findAll();
        System.out.println(empleados);
        */

        // usamos la version 2
        EmpleadoCRUDV2 empleadoCRUD = new EmpleadoCRUDV2();

        Empleado Adolfo = new Empleado("Adolfo","Gomez Losada",22000,true);
        Empleado Pepe = new Empleado("Adolfo","Gomez Losada",22000,true);
        Empleado loco = new Empleado("Adolfo","Gomez Losada",22000,true);

        System.out.println(Pepe);




        // consultar empleados
        List<Empleado> empleados= empleadoCRUD.recuperarEmpleados();
        System.out.println(empleados);

    }

}

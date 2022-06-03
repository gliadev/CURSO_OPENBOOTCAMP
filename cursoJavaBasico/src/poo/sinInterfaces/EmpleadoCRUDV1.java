package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;


/*
C create
R  read
U  update
D  delete

 */
public class EmpleadoCRUDV1 {

    private List<Empleado> empleados = new ArrayList<>();




    // metodo que permite guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    // metodo para ver empleados
    public List<Empleado> findAll(){
        return empleados;
    }
}

package poo.coninterfaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

/*
    se declaran los metodos, no se implementean
    Activa com un contrado de lo que hy que hacer pero no lo hace
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);


}

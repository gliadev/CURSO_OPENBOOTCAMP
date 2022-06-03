package poo.sinInterfaces;

public class Empleado {


    // 1. atributos
    String nombre;
    String apellido;
    double salario;
    boolean alta;

    //2. construtor
    public Empleado(){

    }

    public Empleado(String nombre, String apellido, double salario, boolean alta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.alta = alta;
    }

    //3. metodos
    // to string para poder imprimir los resutaldo

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}

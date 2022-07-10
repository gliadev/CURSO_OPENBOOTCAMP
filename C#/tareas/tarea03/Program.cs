/*

Crea una estructura de datos para un cliente con estos campos:

Nombre completo

Teléfono

Dirección

Email

Si es nuevo cliente

Bonus: escribe un método para presentar estos datos desde la estructura al hacer Console.WriteLine(...)
*/

Clientes misClientes = new Clientes();
Console.WriteLine(misClientes.nombreCompleto);

public struct Clientes
{
    public Clientes(string nombreCompleto, int telefono, string direccion, string email, Boolean esNuevoCliente)
    {
        nombreCompleto = "Adolfo Gomez";
        telefono = 666666666;
        direccion = "Bentura Kalea 45";
        email = "teste@gmail.com";
        esNuevoCliente = false;
    }

    public string nombreCompleto { get; }
    public int telefono { get; }
    public string direccion { get; }
    public string email { get; }
    public Boolean esNuevoCliente { get;  }

    public override string ToString() => $"({nombreCompleto}, {telefono},{direccion},{email}, {esNuevoCliente})";
}
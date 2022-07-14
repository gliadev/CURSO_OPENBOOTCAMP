/*Ejercicio 1 - If

Escribe un programa que:

Pida datos a un cliente: Nombre, email, cupón

Determine si un cliente tiene un cupon descuento

Muestre un precio rebajado en función del descuento

Muestre el precio de un producto sin descuento si no hay cupón

Nota: puedes poner un precio fijo de un producto o uno variable.

*/
int precioArticulo = 100;

Console.WriteLine("Hola, Introduce tu nombre");
string nombreCliente = Console.ReadLine();
Console.WriteLine();
Console.WriteLine();

Console.WriteLine(nombreCliente + " Puedes decirme tu direccion de Email?");
string emailCliente = Console.ReadLine();
Console.WriteLine();
Console.WriteLine();

Console.WriteLine(nombreCliente + "¿ Tienes Cupon descuento ? S / N ");
string respuesta = Console.ReadLine();



if (respuesta == "s")
{
    Console.WriteLine(nombreCliente + " el precio con descuento para ti es " + Math.Sqrt(precioArticulo));
    Console.WriteLine(nombreCliente + " el precio sin descuento es ");
} else (respuesta != "s"){
    Console.WriteLine("Lo siento " + nombreCliente + " al no ser cliente el precio es " + precioArticulo);
}













/*
Ejercicio 2 - Switch

Haz una lista de lenguajes de programación, por ejemplo: C#, Java, C++. Presenta la lista en consola y pide que el usuario seleccione el lenguaje mediante 1, 2, 3 o a, b, c. Presenta el resultado en consola.

Nota: puedes añadir al resultado el “Hola, mundo” para el caso de C#.
*/
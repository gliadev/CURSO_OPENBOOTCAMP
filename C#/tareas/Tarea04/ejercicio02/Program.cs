

/*
Escribe un programa que realice estos pasos:

Reciba al menos un número por consola

Determine si el número es positivo o negativo

Presente un contador para cada tipo (positivo y negativo).

Nota: el cero se puede abordar en una clase adicional ya que no es ni positivo ni negativo. Tienes completa libertad para elegir el formato de la salida.
*/

int contadorPositivo = 0;
int contadorNegativo = 0;
int numero;

do
{
    Console.WriteLine("Introduce un numero");
    numero = Console.ReadLine();
    if((numero %2) == 0)
    {
        Console.WriteLine(numero + "Es par");
        contadorPositivo++;
    }
    else
    {
        Console.WriteLine(numero + " Es inpar ");
        contadorNegativo++;
    }
}


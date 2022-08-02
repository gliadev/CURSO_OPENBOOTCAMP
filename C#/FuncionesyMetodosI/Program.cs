// funciones

// funcion calcular cuadrado de un numero


CalcularCuadrado(2);

int resultado = CalcularCuadrado(7);
Console.WriteLine(resultado); 

int CalcularCuadrado (int n)
{
    Console.WriteLine(n * n);
    return n * n;

}

/* Main */
CalcularAprobado(10);

/* fin del Main */


/* definicion de las funciones */
 void CalcularAprobado(int nota)
{
    if (nota < 5)
    {
        Console.WriteLine( nota + " Con esta nota has supendido ");
    } else if( nota == 5)
    {
        Console.WriteLine("Has aprobado justo");
    } else if (nota > 6)
    {
        Console.WriteLine("Menuda notaza");
    }

}
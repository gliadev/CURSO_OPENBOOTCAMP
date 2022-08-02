

float f = 3.143415f;
EscribirNumeroReal(f);


 static void  EscribirNumeroReal(float n)
{
    Console.WriteLine(n.ToString("#.####"));
}


void SumaDeReales(float a, float b)
{
    float resultado = a + b;
    
    Console.Write(resultado.ToString("#,##"));
}

/*
 * Recursividad
 * Factorial -> !
 * 1!  =  1
 * 2! = 2 * 1 = 2
 */

long CalcularFactorial(int n)
{
    return n * CalcularFactorial(n-1);
}

Console.WriteLine(CalcularFactorial(1));
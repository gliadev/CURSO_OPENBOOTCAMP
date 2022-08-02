// LINQ

// nuestro origen de datos

int[] number = new int[10] {1,2,3,4,5,6,7,8,9,10};

// OBTENER DATOS CON UNA CONSULTA
var consulta = from numero 
               in number where 
               (numero %2 ) == 0 
               select numero;


// UTILIZAR EN NUESTRO PROGRAMA
foreach (var item in consulta)
{
    Console.WriteLine(item);
}

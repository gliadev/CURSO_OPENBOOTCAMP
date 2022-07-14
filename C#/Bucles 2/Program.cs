// IF ... ELSE - SI / SINO

Console.WriteLine("Que dia es hoy");
string dia = Console.ReadLine();

/*
if (dia == "Lunes")
{
    Console.WriteLine("Feliz Lunes");
}
else
{
    Console.WriteLine("Hoy no es lunes");
}
*/




switch (dia)
{
    case "Lunes":
        Console.WriteLine("Es Lunes");
        break;

    case "Martes":
        Console.WriteLine("Es martes");
        break;

    default:
        Console.WriteLine("Eso no es un dia ninguno");
        break;

}

// break

if (dia == "LUNES")
{
    for (int i = 0; i < 3; i++)
    {
        Console.WriteLine("Por poner algo");
        break;
    }
    Console.WriteLine("Aqui se ejecuta el Break");
}

Console.WriteLine("Aqui sale del bucle");


// continue
for (int z = 0; z < 10; z++)
{
    Console.WriteLine(z);
    if (z < 5) {
        Console.WriteLine("z es mejor que 5");
        continue;
    }
}
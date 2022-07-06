string Saludo = "Hola, ";

Console.WriteLine(Saludo + " ¿ Cual es tu nombre ?");
string nombre= Console.ReadLine();
Console.WriteLine(Saludo + " " + nombre);

Console.WriteLine(nombre + " ¿ como te apellidas?");
string apellidos = Console.ReadLine();

Console.WriteLine("¿ Que edad tienes ?");
int edad = int.Parse(Console.ReadLine());


Console.WriteLine("¿ Sabes programar ?");
Boolean IsDEV = false;

Console.WriteLine("¿Quieres mejorar?");
Boolean DoYou = true;

Console.WriteLine(Saludo +" " + nombre + "bienvenido a OpenBootCamp, donde podras aprender y mejorar su conocientos de programacion");

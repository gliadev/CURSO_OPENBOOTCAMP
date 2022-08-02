using System.Text;

// definimos un string
string? str = null;
string str2 = null;
string str3 = System.String.Empty;
string str4 = "";
string str5 = " ";


// tipos de salida
Console.WriteLine(str);
Console.WriteLine(str2);
Console.WriteLine(str3);
Console.WriteLine(str4);
Console.WriteLine($"str5: {str5}");
Console.WriteLine(str5.GetType());

// array de carcateres
char[] letters = { '#', '€', '$' };
Console.WriteLine(letters[0]);

//concatenacion
string mensaje1 = "Buenos dias";
string mensaje2 = "Estamos programamando en C#";
string texto = mensaje1 + mensaje2;
string texto2 = "Buenos dias " + "Estamos programando en C#";
Console.WriteLine(texto);
Console.WriteLine(texto2);

// literales
// caracteres escapados -> \n \u00C6 
string columns = "Experimento 1\tVelocidad 2\tTiempo 3";
string hr = "----------------------------";
string content = "contenido1 \ncontenido1 \ncontenido1\tcontenido2 contenido2 contenido2\tcontenido3";
Console.WriteLine(columns);
Console.WriteLine(hr);
Console.WriteLine(content);

//  filas
string rows = "contenido1 contenido1 contenido1\r\ncontenido2 contenido2 contenido3\r\nRow3";
Console.WriteLine(rows);

// Algunos caracteres esapados. \' \" \\ \v
string multilinea = "Hola, " + 
    " Este es un mensaje " +
    "en varias lineas ";
string multiline2 = @"Hola, este 
es un mesaje de varias lineas sin concatenar ninguna";

string comillas = @"Hola asi imprimimos las ""comillas"",";

Console.WriteLine(multilinea);
Console.WriteLine(multiline2);
Console.WriteLine(comillas);

// interpolacion
var persona = (nombre: "Adolfo", edad:"43", lenguaje: "C#");
Console.WriteLine(persona);

// subcadenas
string miCadena = " Este es mi mensaje";

// substring, replace, indexOf, Trim
String miCadena2 = miCadena.Substring(0, 10);
Console.WriteLine(miCadena2);

string miCadena3 = miCadena.Replace("mensaje", "podcast");
Console.WriteLine(miCadena3);

// limpiar espacios
string micadena4 = miCadena.Trim();
Console.WriteLine(micadena4);

// encontrar cuantas veces aparece un caracter
int micadena5 = miCadena.IndexOf('m');
Console.WriteLine(micadena5);


// string nulos y vacios
string unaCadenaTexto = "Hola";
string unaCadenaNull = null;
string unaCadenaVacia = String.Empty;

string tempStr = str + unaCadenaNull;
Console.WriteLine(tempStr);

// un string vacio y un string nulo NO SON LO MISMO
bool b = (unaCadenaVacia == unaCadenaNull);
Console.WriteLine(b);

unaCadenaNull += unaCadenaTexto;
Console.WriteLine(unaCadenaNull);

//StringBuilder
StringBuilder stringBuilder = new StringBuilder("hola, Mu8ndo");
Console.WriteLine(stringBuilder[0]);// sacariamos la h


// transormar una cadena a un numero si es posible
int i = 0;
string s = "121221";
bool result = int.TryParse(s, out i);

// Arrays
int[] array = new int[2];
string[] names = new string[2];
names[0] = "Adolfo";
names[1] = "Hiizea";

foreach (string name in names)
{
    Console.WriteLine(name);
}

for ( int j = 0; j < array.Length; j++)
{
    Console.WriteLine(names[j]);
}

int[] number = { 5, 8, 9, 11, 34, 67 };
Array.Sort(number);

foreach(int elemento in number)
{
    Console.WriteLine(elemento);
}

// otros tipos de arrays

int[,] miArray2D = new int[2 ,2];
miArray2D[0,0] = 1;
miArray2D[0,1] = 2;
miArray2D[0,2] = 3;
miArray2D[0,3] = 4;

for(int k = 0; k < miArray2D.Length; k++)
{
    
}
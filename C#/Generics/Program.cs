//Generics

Generic<string> str = new Generic<string>();
str.campo = "dato";
Console.WriteLine($"Generic Dato: {str.campo}");
Console.WriteLine($"Tipo de Generic Dato: {str.campo.GetType().FullName}");

public class Generic<T>
{
    public T campo { get; set; }
}


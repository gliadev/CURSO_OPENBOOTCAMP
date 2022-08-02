// Metodos

var moto1 = new Motos();
moto1.ArrancarMoto();


class Motos
{
    public static void Arrancar() {
        Console.WriteLine("Arrancar");
    }
    public void ArrancarMoto()
    {
        Console.WriteLine("Arrancar esta moto");
    }
}

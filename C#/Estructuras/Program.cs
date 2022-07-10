
Coords misCoordenadas = new Coords(5,1,25);

Console.WriteLine(misCoordenadas.X);
Console.WriteLine(misCoordenadas.Y);
Console.WriteLine(misCoordenadas.Z);

public struct Coords
{
    public Coords(double x, double y, double z)
    {
        X = x;
        Y = y;
        Z = z;
    }
    public double X { get; }
    public double Y { get; }
    public double Z { get; }

    public override string ToString() => $"({X},{Y})";
}
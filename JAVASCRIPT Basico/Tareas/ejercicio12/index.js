/* Crea un nuevo fichero JS que contenga las siguientes líneas

- Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])

- Ejecuta la depuración de VSCode para visualizar la ejecución de la función */

let num = 100;

function Fibonacci(num) {
  const fibo = [0, 1];
  for (let i = 2; i < num; i++) {
    // le digo que lo guarde en fibo la posicion i -1 la segunda posicion y i -2 las dos anteriores
    fibo[i] = fibo[i - 1] + fibo[i - 2];
  }
  return fibo;
}

const FibonacciNumeros = Fibonacci(num);
console.log(FibonacciNumeros);

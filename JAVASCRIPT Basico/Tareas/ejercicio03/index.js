let numero = 20;
for (i = 1; i <= numero; i++) {
  numero *= i;
}
console.log(numero);

while (numero > 1) {
  numero *= numero;
  numero--;
}
console.log(numero);

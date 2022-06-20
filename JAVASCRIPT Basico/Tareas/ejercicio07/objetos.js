/* Ejercicio 2






- Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor */

const datos = {
  nombre: "Adolfo",
  apellidos: "Patata Patatin",
  edad: 23,
  altura: 170,
  eresDesarrollador: false,
};
console.log(datos);
let edad = datos.edad;
console.log(edad);

let masDatos = [
  {
    ...datos,
  },
  {
    nombre: "Patatin",
    apellidos: "Patata Patatin",
    edad: 79,
    altura: 150,
    eresDesarrollador: true,
  },
  {
    nombre: "Patatatita",
    apellidos: "Patata Patatin",
    edad: 45,
    altura: 165,
    eresDesarrollador: false,
  },
];
console.log(masDatos);

let masDatosOrdenada = masDatos.sort((a, b) => a.edad - b.edad);
console.log(masDatosOrdenada);

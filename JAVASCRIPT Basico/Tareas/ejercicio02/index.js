/* Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:

- Tu nombre (string)

- Tu edad (number)

- ¿Eres desarrollador? (boolean)

- Tu fecha de nacimiento (Date)

- Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url) */

const nombre = "Adolfo";
let edad = 43;
const desarrollador = true;
let fechaNac = new Date("1979,04,01");

let libro = {
  titulo: "Carlos Azaustre",
  autor: "Aprendiendo JavaScript",
  fecha: new Date(2022, 01, 15),
  url: "https://carlosazaustre.es/",
};

console.log(libro.titulo);

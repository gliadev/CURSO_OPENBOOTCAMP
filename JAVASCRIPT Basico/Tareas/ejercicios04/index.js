let nombre = "Adolfo";
let apellido = "Gomez";

let estudiante = nombre + " " + apellido;

let estudianteMayus = estudiante.toLocaleUpperCase();
let estudianteMinus = estudiante.toLowerCase();

let cuantasLetras = estudiante.length;
let caracterNombre = nombre.substring(0, 1);
let ultimoCaracterApellido = apellido.substring(apellido.length - 1);
console.log(ultimoCaracterApellido);

let sinEspacios = estudiante.replace(/ /g, "");

let estaNombre = estudiante.includes(nombre);

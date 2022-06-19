/* 

- Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)

- Una nueva lista que contenga los directores de la lista de películas original (utilizando map)

- Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)

- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)

- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación) */

let listaCompra = [
  "Leche",
  "Patatas",
  "Pimientos",
  "Lechugas",
  "Papel horno",
  "Galletas",
];
console.log(listaCompra);
listaCompra.push("Aceite de Girasol");
console.log(listaCompra);

listaCompra.pop("Aceite de Girasol");
console.log(listaCompra);

const peliculasFav = [
  {
    titulo: "El Señor de los anillos",
    director: "Peter Robert Jackson ",
    fecha: new Date(1967, 4, 31),
  },
  {
    titulo: "Matrix",
    director: "Thomas Anderson ",
    fecha: new Date(2021, 4, 31),
  },
  {
    titulo: "Harry Potter",
    director: "Peter Robert Jackson ",
    fecha: new Date(2001, 4, 31),
  },
];

let listaAnterior = peliculasFav.filter(
  (pelicula) => pelicula.fecha > new Date(2010, 1, 1)
);
console.log(listaAnterior);

let directorOtro = peliculasFav.map((pelicula) => {
  return peliculasFav.director;
});
console.log(directorOtro);

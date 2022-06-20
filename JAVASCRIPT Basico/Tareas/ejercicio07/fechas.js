let fechaHoy = new Date();
console.log(fechaHoy);

let miCumple = new Date(1979, 01, 04);
console.log(miCumple);

let comparacion = fechaHoy > miCumple;
console.log(comparacion);

let myDay = miCumple.getDate();
console.log(myDay);

let myMonth = miCumple.getMonth();
console.log(myMonth);

let anyNac = miCumple.getFullYear();
console.log(anyNac);

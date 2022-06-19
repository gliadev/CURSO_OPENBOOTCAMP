/* 

- Una variable que contenga tu altura en centímetros (entero)

- Una variable que contenga tu altura en metros (número de coma flotante)

- Una variable que contenga tu peso en kilogramos (número de coma flotante)

- Una variable que contenga tu altura en metros redondeada hacia arriba

- Una variable que contenga tu peso en kilogramos redondeado hacia abajo

- Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript */

let alturaCentimetro = 170;
let alturaMetros = 1.7;
let pesoKilos = 68.5;
let AlturaRedondeada = Math.ceil(alturaMetros);
let pesoRedondeado = Math.floor(pesoKilos);

let valorMax = Number.MAX_VALUE + 1 == Number.MIN_VALUE;

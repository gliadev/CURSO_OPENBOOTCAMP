import { suma, multiplica } from "./modules/controller.js";
import chalk from "chalk";

let sum = suma(1, 2);
console.log(sum);

console.log(chalk.green(multiplica(4, 5)));
console.log("Hello world!");

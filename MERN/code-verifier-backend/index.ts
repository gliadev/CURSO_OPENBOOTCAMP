import express, { Express, Request, Response } from "express";

import dotenv from "dotenv";
//configuracion dotenv
dotenv.config();

// creacion de la Express APP
const app: Express = express();
const port: string | number = process.env.PORT || 8000;

// rutas

app.get("/", (req: Request, res: Response) => {
  // devolvemos un hola mundo
  res.send("Hola mundo");
});

app.get("/hello", (req: Request, res: Response) => {
  // devolvemos un hola mundo
  res.send("HolA DESDE EL OTRO GET");
});

// ejecutamos la aplicacion
app.listen(port, () =>
  console.log(`Servidor Express: funcionando en http://localhost:${port}`)
);

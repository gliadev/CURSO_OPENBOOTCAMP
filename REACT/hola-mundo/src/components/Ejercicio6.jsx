//import userEvent from "@testing-library/user-event";
import React, { useState, useEffect } from "react";

export const Ejercicio06 = () => {
  const estadoInicial = {
    fecha: new Date(),
    edad: 23,
    nombre: "Patata",
    apellidos: "Patatin",
  };
  const [usuario, setUser] = useState(estadoInicial);

  useEffect(() => {
    const edadIntermedia = setInterval(() => {
      actualizarUsuario();
    }, 1000);
    return () => {
      clearInterval(edadIntermedia);
    };
  }, []);

  const actualizarUsuario = () => {
    return setUser({
      fecha: usuario.fecha,
      edad: usuario.edad,
      nombre: usuario.nombre,
      apellidos: usuario.apellidos,
    });
  };

  return (
    <div>
      <div>
        <h1>Tarea 06</h1>
        <h2>Tu hora local es: {usuario.fecha.lo}</h2>
        <h4>Tu nombre {usuario.nombre}</h4>
        <h4>Tus apellidos son: {usuario.apellidos}</h4>
        <h5>y tu edad es: {usuario.edad}</h5>
      </div>
    </div>
  );
};

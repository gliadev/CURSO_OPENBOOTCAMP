import React from "react";
import PropTypes from "prop-types";
import { Contacto } from "../../models/contacto.class";

const ContactoComponent = ({ contacto }) => {
  return (
    <div>
      <h2>Nombre: {contacto.nombre}</h2>
      <h3>Apellido: {contacto.apellido} </h3>
      <h3>Email: {contacto.email}</h3>
      <h4>Conectado: {contacto.conectado}</h4>
      <div>
        <button> ¿ conectado ?</button>
      </div>
    </div>
  );
};

ContactoComponent.propTypes = {
  contacto: PropTypes.instanceOf(Contacto),
};

export default ContactoComponent;

/* this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.conectado = conectado; */

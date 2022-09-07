import React from "react";
import { Contacto } from "../../models/contacto.class";
import ContactoComponent from "../pure/contacto";

const ContactoListComponent = () => {
  const contacto1 = new Contacto("Adolfo", "Gomez", "patata@gmail.com", false);
  return (
    <div>
      <div>
        <h1>lista de Contactos</h1>
      </div>
      <ContactoComponent contacto={contacto1} />
    </div>
  );
};

export default ContactoListComponent;

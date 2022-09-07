import logo from "./logo.svg";
import "./App.css";
import Greeting from "./components/pure/greeting";
import Greetingf from "./components/pure/greetingF";
import TaskListComponent from "./components/container/task_list";
import ContactoListComponent from "./components/container/contacto_list";
import Ejemplo1 from "./hooks/Ejemplo1";
import Ejemplo2 from "./hooks/Ejemplo2";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/* componente propio */}
        {/*  <Greeting name="Adolfo" /> */}
        {/* COMPONENTE DE EJEMPLO FUNCIONAL */}
        {/* <Greetingf name="Adolfo" /> */}
        {/* Componente de listado de tareas */}
        {/* <TaskListComponent /> */}
        {/* EJERCICIO 01 */}
        {/* <ContactoListComponent /> */}
        {/* EMJEMPLOS  DE USO DE HOOOKS */}
        {/* <Ejemplo1 /> */}
        {/* EJEMPLO2 */}
        {/* <Ejemplo2 / */}
        {/* EJERCICIO06 */}
        {/* <Ejercicio06 /> */}
      </header>
    </div>
  );
}

export default App;

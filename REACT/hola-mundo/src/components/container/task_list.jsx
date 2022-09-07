import React from "react";
import { LEVELS } from "../../models/levels.enum";
import { Task } from "../../models/task.class";
import TaskComponent from "../pure/task";

const TaskListComponent = () => {
  const defaultTask = new Task(
    "Ejemplo",
    "Descripcion por defecto",
    false,
    LEVELS.NORMAL
  );
  return (
    <div>
      <div>
        <h1>Tu lista de tareas</h1>
      </div>
      <TaskComponent task={defaultTask} />
    </div>
  );
};

export default TaskListComponent;

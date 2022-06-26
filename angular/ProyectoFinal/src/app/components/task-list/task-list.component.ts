import { Component, OnInit } from '@angular/core';
import { ITask, Levels } from 'src/app/models/interfaces/Task.interface';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.scss']
})
export class TaskListComponent implements OnInit {

  task1: ITask = {

    titulo: 'Task1',
    description: 'Descripcio 1',
    completed: false,
    level: Levels.Blocking
  }
  task2: ITask = {

    titulo: 'Task2',
    description: 'Descripcio 2',
    completed: true,
    level: Levels.Info
  }
  task3: ITask = {

    titulo: 'Task3',
    description: 'Descripcio 3',
    completed: false,
    level: Levels.Urgent
  }

  constructor() { }

  ngOnInit(): void {
  }
  deleteTask(task: ITask){
      alert(`se va eliminar una tarea${task.titulo}`)
  }

}

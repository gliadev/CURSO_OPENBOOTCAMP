export enum Levels{
    "Info",
    "Urgent",
    "Blocking"
}


export interface ITask{
    titulo: string,
    description?: string,
    completed: boolean,
    level: Levels
}
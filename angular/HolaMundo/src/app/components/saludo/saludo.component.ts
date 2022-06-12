import { Component, OnInit, OnDestroy,Input } from '@angular/core';

@Component({
  selector: 'app-saludo',
  templateUrl: './saludo.component.html',
  styleUrls: ['./saludo.component.scss']
})
export class SaludoComponent implements OnInit, OnDestroy {

  @Input() nombre: string = "Anónimo";

  constructor() { }
  
  ngOnInit(): void {
    // instrucciones previas al a renderizaion del componente
    
    console.log("ngOnInit del componente")
  }
  
  /*
  Ejemplo para gestionar un evento de tipo click en el DOM
  
  */
 
 alertaSaludo(): void{  
   alert(`Hola, ${this.nombre}.Alerta depacha desde un clic de boton`)
  }
  
  ngOnDestroy(): void {
    console.log("Componente suludo desaparece");
  }
  

}

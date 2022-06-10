import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-saludo',
  templateUrl: './saludo.component.html',
  styleUrls: ['./saludo.component.scss']
})
export class SaludoComponent implements OnInit {

  nombre: string = "Adolfo";

  constructor() { }

  ngOnInit(): void {
    // instrucciones previas al a renderizaion del componente

    console.log("ngOnInit del componente")
  }

}

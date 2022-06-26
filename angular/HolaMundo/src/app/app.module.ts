import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SaludoComponent } from './components/saludo/saludo.component';
// modulo personalizado importa componentes de tipo lista
import { ListModule } from './modules/list/list.module';

@NgModule({
  declarations: [
    AppComponent,
    SaludoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    // inportamos modulo personalizado
    ListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

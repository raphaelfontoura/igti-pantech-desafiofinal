import { BrowserModule } from "@angular/platform-browser";
import { NgModule, LOCALE_ID } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { CardapioComponent } from "./cardapio/cardapio.component";
import { PedidoComponent } from "./pedido/pedido.component";
import { HttpClientModule } from "@angular/common/http";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import { MatListModule } from "@angular/material/list";
import { MatToolbarModule } from "@angular/material/toolbar";
import { MatButtonModule } from "@angular/material/button";
import { MatBadgeModule } from "@angular/material/badge";
import { MatIconModule } from "@angular/material/icon";
import { MatSelectModule } from "@angular/material/select";

import { registerLocaleData } from "@angular/common";
import localePt from "@angular/common/locales/pt";
import { PedidoStatusComponent } from "./pedido-status/pedido-status.component";
import { PedidosComponent } from "./pedidos/pedidos.component";
import { AtualizarPedidoComponent } from "./atualizar-pedido/atualizar-pedido.component";
import { PedidoService } from "./service/pedido.service";

registerLocaleData(localePt);

@NgModule({
  declarations: [
    AppComponent,
    CardapioComponent,
    PedidoComponent,
    PedidoStatusComponent,
    PedidosComponent,
    AtualizarPedidoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatListModule,
    MatToolbarModule,
    MatButtonModule,
    MatBadgeModule,
    MatIconModule,
    MatSelectModule,
    FormsModule,
  ],
  providers: [{ provide: LOCALE_ID, useValue: "pt" }, PedidoService],
  bootstrap: [AppComponent],
})
export class AppModule {}

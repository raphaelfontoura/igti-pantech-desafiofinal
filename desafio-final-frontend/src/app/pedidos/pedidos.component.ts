import { Component, OnInit } from '@angular/core';
import { Pedido } from '../model/pedido';
import { PedidoService } from '../service/pedido.service';

@Component({
  selector: 'app-pedidos',
  templateUrl: './pedidos.component.html',
  styles: [
    '.mouse-pointer { cursor: pointer }',
  ]
})
export class PedidosComponent implements OnInit {

  pedidos: Pedido[] = [];

  constructor(public pedidoService: PedidoService) { }

  ngOnInit(): void {
    this.pedidoService.buscaPedidos().subscribe(pedidos => {
      this.pedidos = pedidos;
    })
  }

}

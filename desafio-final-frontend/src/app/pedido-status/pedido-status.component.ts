import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Pedido } from '../model/pedido';
import { PedidoService } from '../service/pedido.service';

@Component({
  selector: 'app-pedido-status',
  templateUrl: './pedido-status.component.html',
  styles: [
  ]
})
export class PedidoStatusComponent implements OnInit {

  idPedido: number = 0;

  constructor(private pedidoService: PedidoService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(paramMap => {
      this.idPedido = parseInt(paramMap.get("idPedido") || "0");
      this.carregaPedido();
    });
  }

  carregaPedido() {
    this.pedidoService.carregaPedido(this.idPedido).subscribe( pedido => {
      console.log(pedido);
    })
  }

}

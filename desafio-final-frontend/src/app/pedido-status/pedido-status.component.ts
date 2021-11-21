import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Pedido } from '../model/pedido';
import { PedidoService } from '../service/pedido.service';

@Component({
  selector: 'app-pedido-status',
  templateUrl: './pedido-status.component.html',
  styleUrls: [],
})
export class PedidoStatusComponent implements OnInit {

  idPedido: number = 0;
  pedido: Pedido | null = null;

  constructor(public pedidoService: PedidoService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(param => {
      this.idPedido = parseInt(param.get("idPedido") || "0");
      this.carregaPedido();
    });
    
  }

  carregaPedido() {
    this.pedidoService.carregaPedido(this.idPedido).subscribe( pedido => {
      this.pedido = pedido;
    })
  }

}

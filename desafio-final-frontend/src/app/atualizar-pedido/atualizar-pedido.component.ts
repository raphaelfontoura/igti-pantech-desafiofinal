import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Pedido } from '../model/pedido';
import { PedidoService } from '../service/pedido.service';

@Component({
  selector: 'app-atualizar-pedido',
  templateUrl: './atualizar-pedido.component.html',
  styles: [
  ]
})
export class AtualizarPedidoComponent implements OnInit {

  idPedido: number = 0;
  pedido: Pedido | null = null;

  constructor(private router: Router, private route: ActivatedRoute, public pedidoService: PedidoService) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(param => {
      this.idPedido = parseInt(param.get("idPedido") || "0");
      this.pedidoService.carregaPedido(this.idPedido).subscribe(pedido => {
        this.pedido = pedido;
      })
    })
  }

  salva() {
    if (this.pedido) {
      this.pedidoService.atualizaPedido(this.pedido).subscribe(pedido => {
        this.router.navigate(['/pedidos']);
      })
    }
  }

}

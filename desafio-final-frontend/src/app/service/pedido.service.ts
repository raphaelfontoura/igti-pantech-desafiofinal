import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pedido } from '../model/pedido';
import { Produto } from '../model/produto';

const urlBase = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {
  
  constructor(private httpClient: HttpClient) {}

  itens: { produto: Produto, quantidade: number }[] = [];

  adicionaProduto(produto: Produto) {
    let item = this.itens.find(item => item.produto.descricao === produto.descricao);
    if (item) {
      item.quantidade++;
    } else {
      this.itens.push({ produto, quantidade: 1 });
    }
  }

  buscaProdutos() {
    return this.httpClient.get<Produto[]>(urlBase + '/cardapio');
  }
  
  limpaPedido() {
    this.itens = [];
  }

  realizaPedido() {
    return this.httpClient.post<Pedido>(urlBase + '/pedidos', {
      itens: this.itens
    });
  }

  carregaPedido(idPedido: number) {
    return this.httpClient.get<Pedido>(urlBase + '/pedidos/' + idPedido);
  }

  buscaPedidos() {
    return this.httpClient.get<Pedido[]>(urlBase + '/pedidos/');
  }

  get valorTotal() {
    let valor = 0;
    for (const item of this.itens) {
      valor += item.produto.preco * item.quantidade;
    }
    return valor;
  }

  get quantidadeTotal() {
    let quantidade = 0;
    for (const item of this.itens) {
      quantidade += item.quantidade;
    }
    return quantidade;
  }
}

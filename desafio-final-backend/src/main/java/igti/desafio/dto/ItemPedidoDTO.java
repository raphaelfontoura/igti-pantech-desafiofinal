package igti.desafio.dto;

import igti.desafio.modelo.ItemPedido;
import igti.desafio.modelo.Produto;

import javax.persistence.Column;

public class ItemPedidoDTO {
    private ProdutoDTO produto;
    private Integer quantidade;

    public ItemPedidoDTO() {}
    public ItemPedidoDTO(ItemPedido entity) {
        this.produto = new ProdutoDTO(entity.getProduto());
        this.quantidade = entity.getQuantidade();
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}

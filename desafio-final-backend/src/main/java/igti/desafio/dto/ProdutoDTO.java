package igti.desafio.dto;

import igti.desafio.modelo.Produto;

public class ProdutoDTO {
    private Integer id;
    private String categoria;
    private String descricao;
    private Double preco;

    public ProdutoDTO() {
    }

    public ProdutoDTO(Integer id, String categoria, String descricao, Double preco) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public ProdutoDTO(Produto entity) {
        this.id = entity.getId();;
        this.categoria = entity.getCategoria();
        this.descricao = entity.getDescricao();
        this.preco = entity.getPreco();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

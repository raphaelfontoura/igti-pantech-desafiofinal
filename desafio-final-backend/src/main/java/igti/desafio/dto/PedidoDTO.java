package igti.desafio.dto;

import igti.desafio.modelo.ItemPedido;
import igti.desafio.modelo.Pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {
    private Integer id;
    private LocalDateTime dataHora;
    private String situacao;
    private final List<ItemPedidoDTO> itens = new ArrayList<>();

    public PedidoDTO() {

    }

    public PedidoDTO(Integer id, LocalDateTime dataHora, String situacao) {
        this.id = id;
        this.dataHora = dataHora;
        this.situacao = situacao;
    }

    public PedidoDTO(Pedido entity) {
        this.id = entity.getId();;
        this.dataHora = entity.getDataHora();
        this.situacao = entity.getSituacao();
        this.itens.addAll(entity.getItens().stream().map(ItemPedidoDTO::new).collect(Collectors.toList()));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<ItemPedidoDTO> getItens() {
        return itens;
    }
}

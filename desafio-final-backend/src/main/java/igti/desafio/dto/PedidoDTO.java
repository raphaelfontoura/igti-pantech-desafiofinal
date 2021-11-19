package igti.desafio.dto;

import igti.desafio.modelo.ItemPedido;
import igti.desafio.modelo.Pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoDTO {
    private Integer id;
    private LocalDateTime dataHora;
    private String situacao;
    private final List<ItemPedido> itens = new ArrayList<>();

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
        this.itens.addAll(entity.getItens());
    }
}

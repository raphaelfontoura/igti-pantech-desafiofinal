package igti.desafio.service;

import igti.desafio.modelo.Pedido;
import igti.desafio.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public Pedido realizaPedido(Pedido pedido) {
        pedido.setDataHora(LocalDateTime.now());
        pedido.setSituacao(Pedido.SITUACAO_AGUARDANDO);
        return repository.save(pedido);
    }

    public Pedido getById(Integer idPedido) {
        return repository.findById(idPedido).orElse(null);
    }
}

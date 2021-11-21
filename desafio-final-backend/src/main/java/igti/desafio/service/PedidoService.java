package igti.desafio.service;

import igti.desafio.modelo.Pedido;
import igti.desafio.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    @Transactional
    public Pedido realizaPedido(Pedido pedido) {
        pedido.setDataHora(LocalDateTime.now());
        pedido.setSituacao(Pedido.SITUACAO_AGUARDANDO);
        return repository.save(pedido);
    }

    @Transactional
    public Pedido update(Pedido pedido) {
        return repository.save(pedido);
    }

    @Transactional(readOnly = true)
    public Pedido getById(Integer idPedido) {
        return repository.findById(idPedido).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Pedido> findAll() {
        return repository.findAll();
    }

}

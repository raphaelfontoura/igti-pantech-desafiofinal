package igti.desafio.controller;

import igti.desafio.modelo.Pedido;
import igti.desafio.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public Pedido realizaPedido(@RequestBody Pedido pedido) {
        return service.realizaPedido(pedido);
    }
}

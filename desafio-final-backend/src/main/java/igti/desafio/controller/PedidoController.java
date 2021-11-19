package igti.desafio.controller;

import igti.desafio.modelo.Pedido;
import igti.desafio.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public Pedido realizaPedido(@RequestBody Pedido pedido) {
        return service.realizaPedido(pedido);
    }

    @GetMapping("/{idPedido}")
    public Pedido getPedido(@PathVariable Integer idPedido) {
        return service.getById(idPedido);
    }
}

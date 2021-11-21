package igti.desafio.controller;

import igti.desafio.dto.PedidoDTO;
import igti.desafio.modelo.Pedido;
import igti.desafio.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<Pedido> realizaPedido(@RequestBody Pedido pedido) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.realizaPedido(pedido));
    }

    @GetMapping("/{idPedido}")
    public ResponseEntity<Pedido> getPedido(@PathVariable Integer idPedido) {
        return ResponseEntity.ok(service.getById(idPedido));
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping("/{idPedido}")
    public ResponseEntity<Pedido> update(@PathVariable Integer idPedido, @RequestBody Pedido pedido) {
        if (service.getById(idPedido) == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(service.update(pedido));
    }
}

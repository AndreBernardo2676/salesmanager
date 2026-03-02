package com.andre.salesmanager.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.andre.salesmanager.model.Pedido;
import com.andre.salesmanager.service.PedidoService;

@RestController
@RequestMapping("/pedidos")

public class PedidoController {

    private final PedidoService pedidoService;
    
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/{clienteId")

    public ResponseEntity<Pedido> criarPedido(@PathVariable Long clienteId) {
        Pedido pedido = pedidoService.criarPedido(clienteId);
        return ResponseEntity.ok(pedido);
    } 
      
    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<Pedido>> listarPorCliente(@PathVariable Long clienteId) {
        List<Pedido> pedidos = pedidoService.listarPorCliente(clienteId);
        return ResponseEntity.ok(pedidos);
    }   
}

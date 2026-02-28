package com.andre.salesmanager.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.andre.salesmanager.model.Cliente;
import com.andre.salesmanager.model.Pedido;
import com.andre.salesmanager.repository.ClienteRepository;
import com.andre.salesmanager.repository.PedidoRepository;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;

    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
    }
    public Pedido criarPedido(Long clienteId) {

        Cliente cliente = clienteRepository.findById(clienteId)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        Pedido pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setCliente(cliente);

        return pedidoRepository.save(pedido);
    }
    public List<Pedido> listarPorCliente(Long clienteId){
        return pedidoRepository.findByClienteId(clienteId);
    }


}

package com.andre.salesmanager.model;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Pedido() {

    }
    public Pedido(LocalDateTime data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void  setData(LocalDateTime data){
        this.data = data;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido other = (Pedido) o;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    

}

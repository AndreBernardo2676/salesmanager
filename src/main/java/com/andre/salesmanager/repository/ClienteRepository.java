package com.andre.salesmanager.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.andre.salesmanager.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}

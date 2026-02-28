package com.andre.salesmanager.model;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;



@Entity
public class Cliente {

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Pedido> pedidos = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @Email
    @NotBlank
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String cpf;

    public Cliente() {
    }
    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cliente)) return false;
		Cliente other = (Cliente) o;
		return id != null && id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return 31;
	}



}

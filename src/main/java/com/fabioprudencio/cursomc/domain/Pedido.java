package com.fabioprudencio.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer Id;
	private Date Instante;
	
	private Pagamento pagamento;
	
	private Cliente cliente;
	
	private Endereco enderecoDeEndereco;	
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date instante, Pagamento pagamento, Cliente cliente, Endereco enderecoDeEndereco) {
		super();
		Id = id;
		Instante = instante;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.enderecoDeEndereco = enderecoDeEndereco;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getInstante() {
		return Instante;
	}

	public void setInstante(Date instante) {
		Instante = instante;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoDeEndereco() {
		return enderecoDeEndereco;
	}

	public void setEnderecoDeEndereco(Endereco enderecoDeEndereco) {
		this.enderecoDeEndereco = enderecoDeEndereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
}
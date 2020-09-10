package com.fabioprudencio.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fabioprudencio.cursomc.domain.enums.EstadoPagamento;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer Id;
	private EstadoPagamento estado;
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	private Pedido pedido;
	
	public Pagamento( ) {
		
	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		Id = id;
		this.estado = estado;
		this.pedido = pedido;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public EstadoPagamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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
		Pagamento other = (Pagamento) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

}

package com.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONOS")
public class Telefono {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtelefonos;
	private String telefono;

	public Integer getIdTelefonos() {
		return idtelefonos;
	}

	public void setIdTelefonos(Integer idtelefonos) {
		this.idtelefonos = idtelefonos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(telefono);
		return builder.toString();
	}
	
	

}

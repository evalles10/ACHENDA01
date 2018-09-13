package com.agenda.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.agenda.model.Persona;

@Entity
@Table(name = "DIRECCIONES")
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddirecciones;
	private String direccion;
	private String codpostal;
	private String localidad;
	private String provincia;

	
	
	
	
	public Direccion() {
		super();
	}

	public Direccion(Integer iddirecciones, String direccion, String codpostal, String localidad, String provincia) {
		super();
		this.iddirecciones = iddirecciones;
		this.direccion = direccion;
		this.codpostal = codpostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Integer getIddirecciones() {
		return iddirecciones;
	}

	public void setIddirecciones(Integer iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codpostal;
	}

	public void setCodPostal(String codpostal) {
		this.codpostal = codpostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion [iddirecciones=" + iddirecciones + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad + ", provincia=" + provincia + "]";
	}
	
	

}

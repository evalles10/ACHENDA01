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

@Entity
@Table(name="DEPARTAMENTOS")

public class Departamentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDepartamento;
	private String nombre;
	
	@OneToMany(mappedBy = "idDepartamento",cascade = CascadeType.ALL)
	@JoinColumn(name = "idDepartamento")
	private Empleado empleado;
	
	public Departamentos() {
		super();
	}

	public Departamentos(Integer idDepartamento, String nombre) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamentos [idDepartamento=" + idDepartamento + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}

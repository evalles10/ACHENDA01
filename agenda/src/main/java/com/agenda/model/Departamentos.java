package com.agenda.model;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Integer iddepartamento;
	private String nombre;
	
	 
	/*ES opcional, porque no tiene porque ser bidireccional a menos que se haga una búsqueda por departamento
	 * @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	private List<Empleado> listaDepartamento;
	*/
	
	public Departamentos() {
		super();
	}

	public Departamentos(Integer iddepartamento, String nombre) {
		super();
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
	}

	public Integer getIdDepartamento() {
		return iddepartamento;
	}

	public void setIdDepartamento(Integer iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamentos [iddepartamento=" + iddepartamento + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}

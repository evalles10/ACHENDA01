package com.agenda.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "CATEGORIAS")
public class Categorias implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategorias;
	private String nombre;
	private String descripcion;
	
	@OneToMany(mappedBy = "idEmpleados",cascade = CascadeType.ALL)
	@JoinColumn(name = "idEmpleados")
	private Empleado empleado;
	
	//GET Y SET
	public int getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	// FIN GET SET
	
	
	//CONSTRUCTOR
	public Categorias(int idcategorias, String nombre, String descripcion) {
		super();
		this.idcategorias = idcategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Categoria [idcategorias=" + idcategorias + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	//
	
	
}

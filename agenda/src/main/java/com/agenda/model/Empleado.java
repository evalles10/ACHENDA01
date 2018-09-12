package com.agenda.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADOS")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idempleado;
	private Integer codEmpleado;
	private Integer salario;
	private Timestamp fechaAlta;

	@OneToOne
	@JoinColumn(name = "idempleados", referencedColumnName = "idEmpleado")
	private Persona persona;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria")
	private Categorias categoria;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDepartamento")
	private Departamentos departamento;

	public Empleado() {
		super();
	}

	public Empleado(Integer idempleados, Integer codEmpleado, Integer salario, Timestamp fechaAlta, Empleado empleado) {
		super();
		this.idempleado = idempleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;

	}

	// GET Y SET
	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Integer getIdEmpleado() {
		return idempleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idempleado = idEmpleado;
	}

	public Integer getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Integer codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleados=" + idempleado + ", codEmpleado=" + codEmpleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + "]";
	}

}

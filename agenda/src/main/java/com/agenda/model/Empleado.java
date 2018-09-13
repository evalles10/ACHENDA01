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
	private Integer idempleados;
	private String codempleado;
	private Integer salario;
	private Timestamp fechaalta;

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

	public Empleado(Integer idempleados, String codempleado, Integer salario, Timestamp fechaalta, Persona persona,
			Categorias categoria, Departamentos departamento) {
		super();
		this.idempleados = idempleados;
		this.codempleado = codempleado;
		this.salario = salario;
		this.fechaalta = fechaalta;
		this.persona = persona;
		this.categoria = categoria;
		this.departamento = departamento;
	}



	// GET Y SET
	
	public Integer getIdempleados() {
		return idempleados;
	}

	public void setIdempleados(Integer idempleados) {
		this.idempleados = idempleados;
	}

	public String getCodEmpleado() {
		return codempleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codempleado = codEmpleado;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Timestamp getFechaAlta() {
		return fechaalta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaalta = fechaAlta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Empleado [idempleados=" + idempleados + ", codEmpleado=" + codempleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaalta + ", persona=" + persona + ", categoria=" + categoria + ", departamento="
				+ departamento + "]";
	}

	

	
}

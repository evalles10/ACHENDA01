package com.agenda.model;
import com.agenda.model.Departamentos;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="EMPLEADO")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpleados;
	private Integer codEmpleado;
	private Integer salario;
	private Timestamp fechaAlta;
	
	@OneToMany(mappedBy = "idDepartamento",cascade = CascadeType.ALL)
	@JoinColumn(name = "iDepartamento")
	private Departamentos departamentos;
	

	public Empleado() {
		super();
	}

	public Empleado(Integer idEmpleados, Integer codEmpleado, Integer salario, Timestamp fechaAlta, Empleado empleado) {
		super();
		this.idEmpleados = idEmpleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
	
	}

	public Integer getIdEmpleados() {
		return idEmpleados;
	}

	public void setIdEmpleados(Integer idEmpleados) {
		this.idEmpleados = idEmpleados;
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
		return "Empleado [idEmpleados=" + idEmpleados + ", codEmpleado=" + codEmpleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	

}

package com.agenda.dao;
import com.agenda.model.Empleado;
import java.util.List;

public interface EmpleadoRepositoryCustom {

	List<Empleado>getCodEmpleado(String empleados);
	public List<Empleado> getIdEmpleado(String empleado);
	public List<Empleado> getIdPersonas(String empleado);
	
	
}

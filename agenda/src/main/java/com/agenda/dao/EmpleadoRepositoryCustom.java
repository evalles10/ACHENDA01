package com.agenda.dao;
import com.agenda.model.Empleado;
import java.util.List;

public interface EmpleadoRepositoryCustom {

	public List<Empleado> findByName(String name);
	
	
}

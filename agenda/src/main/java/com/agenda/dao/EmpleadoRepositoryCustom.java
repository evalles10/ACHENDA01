package com.agenda.dao;
import com.agenda.model.Empleado;
import java.util.List;

public interface EmpleadoRepositoryCustom {

	List<Empleado>getNombres(String nombres);
	
	
}
package com.agenda.services;

import java.util.*;


import com.agenda.model.*;


public interface EmpleadoService {

	public List<Empleado> list();
	public Empleado get(int idEmpleado);
	public void update(Empleado empleados);
	public void add(Empleado empleados);
	public void delete(int idEmpleados);
	
}

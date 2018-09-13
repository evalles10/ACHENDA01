package com.agenda.services;

import java.util.*;


import com.agenda.model.*;




public interface EmpleadoService {

	public List<Empleado> list();
	public Empleado findById(Integer idempleados);
	public void update(Empleado empleados);
	public void add(Empleado empleados);
	public void delete(int idempleados);
	public List<Empleado> findByName(String name);
	
}

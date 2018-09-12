package com.agenda.services;

import java.util.*;
import com.agenda.model.*;

public interface EmpleadoService {

	public List<Empleado> list();
	public Empleado get(int idEmpleado);
	public void update(Empleado empleado);
	public void add(Empleado empleado);
	public void delete(int idEmpleado);
	//Tengo el pene negro
}

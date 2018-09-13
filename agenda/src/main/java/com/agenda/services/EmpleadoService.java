package com.agenda.services;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.model.*;
import com.agenda.model.Empleado;



@Service
@Transactional
public interface EmpleadoService {

public List<Empleado> list();
	
	
	public Empleado findById(Integer id);
	public List<Empleado> findByName(String name);
	public void saveEmpleado(Empleado empleado);

	public boolean deleteEmpleado(Empleado empleado);
	;
	
}

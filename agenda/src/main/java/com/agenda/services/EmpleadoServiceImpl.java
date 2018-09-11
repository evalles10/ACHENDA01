package com.agenda.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.model.Empleado;


@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoService empleadoService;
	

	public void ListarEmpleados(){
	}
	
	public EmpleadoServiceImpl(EmpleadoService empleadoService) {
		super();
		this.empleadoService = empleadoService;
	}

	@Override
	public List<Empleado> list() {
		
		return empleadoService.list();
	}
	@Override
	public Empleado get(int idEmpleado) {
		return empleadoService.get(idEmpleado);
	}

	@Override
	public void update(Empleado empleado) {
		empleadoService.update(empleado);
		
	}

	@Override
	public void add(Empleado empleado) {
		empleadoService.add(empleado);
		
	}

	@Override
	public void delete(int idEmpleado) {
		empleadoService.delete(idEmpleado);
		
	}
}

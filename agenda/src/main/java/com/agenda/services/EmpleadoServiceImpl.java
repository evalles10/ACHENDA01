package com.agenda.services;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agenda.dao.EmpleadosRepository;
import com.agenda.model.Empleado;



@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadosRepository empleadoDAO;
	
	@Override
	public List<Empleado> list(){
		return empleadoDAO.findAll();
	}
	@Override
	public Empleado get(int idEmpleado){
		return empleadoDAO.findOne(idEmpleado);
		
	}
	@Override
	public void update(Empleado empleado){
		empleadoDAO.save(empleado);
	}
	
	@Override
	public void add(Empleado empleado){
	empleadoDAO.save(empleado);
	}
	
	@Override
	public void delete(int idEmpleado){
		empleadoDAO.delete(idEmpleado);
	}
	
}

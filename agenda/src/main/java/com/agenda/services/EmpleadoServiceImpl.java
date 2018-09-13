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

	public List<Empleado> list(){
		return empleadoDAO.findAll();
	}

	public Empleado findById(Integer id){
		return empleadoDAO.findById(id).get();
	}
	

	@Override
	public List<Empleado> findByName(String name) {
		return empleadoDAO.findByName(name);
	}

	@Override
	public void saveEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

}

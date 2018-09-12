package com.agenda.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.dao.EmpleadosRepository;
import com.agenda.model.Empleado;

@Repository
@Transactional(readOnly = true)
public class EmpleadosRepositoryImpl implements EmpleadoRepositoryCustom{

	 @PersistenceContext
	    EntityManager entityManager;
	@Override
	public List<Empleado> getCodEmpleado(String empleado){
		Query query = entityManager.createNativeQuery("SELECT codEmpleado FROM empleados ");
		return query.getResultList();
		
	}
	
	@Override
	public List<Empleado> getIdPersonas(String empleado){
		Query query = entityManager.createNativeQuery("SELECT idpersonas FROM personas ");
		return query.getResultList();
		
	}

	@Override
	public List<Empleado> getIdEmpleado(String empleado){
		Query query = entityManager.createNativeQuery("SELECT idempleado FROM empleados ");
		return query.getResultList();
		
	}

	 
}

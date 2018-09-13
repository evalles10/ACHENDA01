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
		public List<Empleado> findByName(String name) {
			Query query = entityManager
			.createNativeQuery("SELECT * FROM personas, empleados, departamentos, categorias, direcciones, telefonos " + 
								"WHERE personas.id_empleado=empleados.idempleados " + 
								"AND empleados.id_departamento=departamentos.iddepartamento " +
								"AND empleados.id_categoria=categorias.id_categorias " +
								"AND personas.idpersonas=direcciones.id_persona " +
								"AND personas.idpersonas=telefonos.id_persona " +
								"AND personas.nombre like ? group by personas.nombre; ", Empleado.class);
	     query.setParameter(1, name + "%");
	     return query.getResultList();
		}
		
	 
}

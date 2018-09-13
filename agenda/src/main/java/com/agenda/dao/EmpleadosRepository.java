package com.agenda.dao;

import java.util.List;
import com.agenda.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface EmpleadosRepository extends JpaRepository<Empleado, Integer>, EmpleadoRepositoryCustom {

		//Empleado findOne(int idEmpleados);

		//Empleado delete(int idempleados);d

		
	}


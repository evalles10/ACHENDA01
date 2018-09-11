package com.agenda.dao;
import java.util.List;
import com.agenda.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmpleadosRepository {

	@Repository
	public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
	}
	
}

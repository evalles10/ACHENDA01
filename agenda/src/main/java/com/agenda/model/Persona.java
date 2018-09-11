package com.agenda.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONAS")
public class Persona implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpersonas;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento; // Mi gente esto hay que discutir con dios si usar Date o calendar porque huele a chotuno
	
									//Mi gente otra vez, faltan setters y getters porque hay que meter el FK y luego se nos va a olvidar
	
	
	
}

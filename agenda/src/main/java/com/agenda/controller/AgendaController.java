package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.agenda.model.*;
import com.agenda.services.*;

@Controller
public class AgendaController {

	@Autowired
	private EmpleadoService empleadoService;
	
	private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);
	

	@GetMapping("/")
	public ModelAndView handleRequest() throws Exception {
		logger.info("--en ListadoController");
		List<Empleado> listEmpleados = empleadoService.list();
		logger.info("--- "+ listEmpleados);
		ModelAndView model = new ModelAndView("ListadoEmpleados");
		model.addObject("empleadoList", listEmpleados);
		return model;
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newEmpleado() {
		logger.info("-- en NEW");
		ModelAndView model = new ModelAndView("ListadoEmpleados");
		model.addObject("empleado", new Empleado());
		return model;		
	}
	
	/*@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editEmpleado(HttpServletRequest request) {
		logger.info("-- en EDIT");
		int IdEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
		Empleado empleado = empleadoService.get(IdEmpleado);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("empleado", empleado);
		return model;		
	}*/
	
	/*@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteEmpleado(HttpServletRequest request) {
		logger.info("-- en DELETE");
		int IdEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
		empleadoService.delete(IdEmpleado);
		return new ModelAndView("redirect:/");		
	}*/
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmpleado(@ModelAttribute Empleado empleado) {
		logger.info("-- en SAVE");
		empleadoService.add(empleado);
		return new ModelAndView("redirect:/");
	}
	
	
	
	
	
	
}

package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.agenda.model.*;
import com.agenda.services.*;

@Controller
public class AgendaController {

	@Autowired
	private AgendaService agendaService;
	
	private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);
	
	@RequestMapping("/")
	
}

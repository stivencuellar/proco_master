package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.TareaImplLocal;		
		
@Controller		
public final class TareaController{		
	@RequestMapping(value = "/Tarea", method = RequestMethod.GET)	
	public ModelAndView inicioTarea(){	
		ModelAndView model = new ModelAndView();
		model.addObject("tareaobj",new TareaImplLocal().getTareas());
		model.setViewName("tareaRender");
		return model;
	}	
}		

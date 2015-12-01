package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.RequerimientoImplLocal;		
		
@Controller		
public final class RequerimientoController{		
	@RequestMapping(value = "/Requerimiento", method = RequestMethod.GET)	
	public ModelAndView inicioRequerimiento(){	
		ModelAndView model = new ModelAndView();
		model.addObject("requerimientoobj",new RequerimientoImplLocal().getRequerimientos());
		model.setViewName("requerimientoRender");
		return model;
	}	
}		

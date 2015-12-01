package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.ObjetivoImplLocal;		
		
@Controller		
public final class ObjetivoController{		
	@RequestMapping(value = "/Objetivo", method = RequestMethod.GET)	
	public ModelAndView inicioObjetivo(){	
		ModelAndView model = new ModelAndView();
		model.addObject("objetivoobj",new ObjetivoImplLocal().getObjetivos());
		model.setViewName("objetivoRender");
		return model;
	}	
}		


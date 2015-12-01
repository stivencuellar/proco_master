package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.EvidenciaImplLocal;		
		
@Controller		
public final class EvidenciaController{		
	@RequestMapping(value = "/Evidencia", method = RequestMethod.GET)	
	public ModelAndView inicioEvidencia(){	
		ModelAndView model = new ModelAndView();
		model.addObject("evidenciaobj",new EvidenciaImplLocal().getEvidencias());
		model.setViewName("evidenciaRender");
		return model;
	}	
}		


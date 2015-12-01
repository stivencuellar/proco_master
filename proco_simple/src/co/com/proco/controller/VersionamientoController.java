package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.VersionamientoImplLocal;		
		
@Controller		
public final class VersionamientoController{		
	@RequestMapping(value = "/Versionamiento", method = RequestMethod.GET)	
	public ModelAndView inicioVersionamiento(){	
		ModelAndView model = new ModelAndView();
		model.addObject("versionamientoobj",new VersionamientoImplLocal().getVersionamiento());
		model.setViewName("versionamientoRender");
		return model;
	}	
}		

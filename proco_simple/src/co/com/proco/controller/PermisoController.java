package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.PermisoImplLocal;		
		
@Controller		
public final class PermisoController{		
	@RequestMapping(value = "/Permiso", method = RequestMethod.GET)	
	public ModelAndView inicioPermiso(){	
		ModelAndView model = new ModelAndView();
		model.addObject("permisoobj",new PermisoImplLocal().getPermiso());
		model.setViewName("permisoRender");
		return model;
	}	
}		

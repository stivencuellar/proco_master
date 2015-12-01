package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.PerfilImplLocal;		
		
@Controller		
public final class PerfilController{		
	@RequestMapping(value = "/Perfil", method = RequestMethod.GET)	
	public ModelAndView inicioPerfil(){	
		ModelAndView model = new ModelAndView();
		model.addObject("perfilobj",new PerfilImplLocal().getPerfiles());
		model.setViewName("perfilRender");
		return model;
	}	
}		

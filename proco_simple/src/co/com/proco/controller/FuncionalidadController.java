package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.FuncionalidadImplLocal;		
		
@Controller		
public final class FuncionalidadController{		
	@RequestMapping(value = "/Funcionalidad", method = RequestMethod.GET)	
	public ModelAndView inicioFuncionalidad(){	
		ModelAndView model = new ModelAndView();
		model.addObject("funcionalidadobj",new FuncionalidadImplLocal().getFuncionalidades());
		model.setViewName("funcionalidadRender");
		return model;
	}	
}		

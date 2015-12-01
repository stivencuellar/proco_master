package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.VinculoImplLocal;		
		
@Controller		
public final class VinculoController{		
	@RequestMapping(value = "/Vinculo", method = RequestMethod.GET)	
	public ModelAndView inicioVinculo(){	
		ModelAndView model = new ModelAndView();
		model.addObject("vinculoobj",new VinculoImplLocal().getVinculo());
		model.setViewName("vinculoRender");
		return model;
	}	
}		

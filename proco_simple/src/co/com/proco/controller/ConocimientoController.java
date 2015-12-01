package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.ConocimientoImplLocal;

@Controller	
public final class ConocimientoController{	
	@RequestMapping(value = "/Conocimiento", method = RequestMethod.GET)
	public ModelAndView inicioConocimiento(){
		ModelAndView model = new ModelAndView();
		model.addObject("conocimientoobj",new ConocimientoImplLocal().getConocimientos());
		model.setViewName("conocimientoRender");
		return model;
	}	
}


package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.ProyectosImplLocal;

@Controller
public class ProyectosController {
	@RequestMapping(value = "/Proyectos", method = RequestMethod.GET)
	public ModelAndView inicioProyectos() {
		ModelAndView model = new ModelAndView();
		model.addObject("proyectosobj",new ProyectosImplLocal().getProyectos());
		model.setViewName("proyectosRender");
		return model;
	}
}

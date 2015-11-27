package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.ActividadesImplLocal;

@Controller
public final class ActividadesController {

	@RequestMapping(value = "/Actividades", method = RequestMethod.GET)
	public ModelAndView inicioMisCosas() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("actividadesobj",new ActividadesImplLocal().getActividades());
		model.setViewName("actividades");
		return model;
	}
}
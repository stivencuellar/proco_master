package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.IndividuosImplLocal;


@Controller
public class IndividuoController {

	@RequestMapping(value = "/Individuos", method = RequestMethod.GET)
	public ModelAndView inicioIndividuos() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("individuosobj",new IndividuosImplLocal().getIndividuos());
		model.setViewName("individuosRender");
		return model;
	}
}

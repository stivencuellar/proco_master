package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.InformacionAcademicaImplLocal;


@Controller
public class InformacionAcademicaController {

	@RequestMapping(value = "/InformacionAcademica", method = RequestMethod.GET)
	public ModelAndView inicioInformacionAcademica() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("infoobj",new InformacionAcademicaImplLocal().getInformacionAcademica());
		model.setViewName("infoAcademicaRender");
		return model;
	}
}
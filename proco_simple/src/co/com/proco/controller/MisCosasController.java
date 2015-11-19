package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.MisCosasServicesImplLocal;
import co.com.proco.servicios.MisCosasServicesInterface;

@Controller
public class MisCosasController {
	@RequestMapping(value = "/MisCosas", method = RequestMethod.GET)
	public ModelAndView inicioMisCosas() {
		
		/* Invocar el servicio. **/
		MisCosasServicesInterface rMisCosas = new MisCosasServicesImplLocal();
		ModelAndView model = new ModelAndView();
		model.addObject("actividadesobj",new MisCosasServicesImplLocal().getActividades());
		model.addObject("proyectosobj",new MisCosasServicesImplLocal().getProyectos());
		model.setViewName("misCosas");
		return model;
	}
}
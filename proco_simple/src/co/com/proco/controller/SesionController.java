package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.SesionServicesImplLocal;
import co.com.proco.servicios.SesionServicesInterface;

@Controller
public class SesionController {
	
	@RequestMapping(value = "/sesion", method = RequestMethod.GET)
	public ModelAndView inicioSesiones() {
		
		/* Invocar el servicio. **/
		SesionServicesInterface rSesion = new SesionServicesImplLocal();
		
		ModelAndView modelAndView = new ModelAndView("index", "sesionobj", rSesion.ObtenerSesion());
		return modelAndView;
	}
}
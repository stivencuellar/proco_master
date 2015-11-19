package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.proco.servicios.ConfiguracionImplLocal;
import co.com.proco.servicios.ConfiguracionInterface;

@Controller
public class ConfiguracionController {

	
	@RequestMapping(value = "/Configuracion", method = RequestMethod.GET)
	public ModelAndView cargandoConfiguracion(){
		
		ConfiguracionInterface recuperarConfiguracion = new ConfiguracionImplLocal();
		ModelAndView modelAndView = new ModelAndView("configuracion", "configuracionObj",recuperarConfiguracion.recuperarConfiguracionBD());
		return modelAndView;
	}
	
}

package co.com.proco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import co.com.proco.servicios.AreasConocimientoImplLocal;
import co.com.proco.servicios.AreasConocimientoInterface;

/**
 * Controlador de �reas de conocimiento, clase que nos permite el manejo de eventos de la vista de �reas de conocimiento
 * @author SCuellar
 *
 */
@Controller
public class AreaConocimientoController {
	
	/**
	 * M�todo que permite la navegaci�n entre p�ginas, es importante resaltar que va a permitir la navegaci�n entre
	 * las �reas de conocimiento.
	 * @return
	 */
	@RequestMapping(value = "/areasConocimientoRender", method = RequestMethod.GET)
	public ModelAndView flujoAreaConocimiento(){
		AreasConocimientoInterface recuperarAreaConocimiento = new AreasConocimientoImplLocal();
		ModelAndView modelAndView =  new ModelAndView("areasConocimientoRender", "areaConocimientoObj", recuperarAreaConocimiento.recuperarAreasConocimientoBD());
		return modelAndView;
	}	
}

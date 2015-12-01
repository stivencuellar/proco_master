package co.com.proco.controller;

import org.springframework.stereotype.Controller;		
import org.springframework.web.bind.annotation.RequestMapping;		
import org.springframework.web.bind.annotation.RequestMethod;		
import org.springframework.web.servlet.ModelAndView;		
		
import co.com.proco.servicios.PostulanteImplLocal;		
		
@Controller		
public final class PostulanteController{		
	@RequestMapping(value = "/Postulante", method = RequestMethod.GET)	
	public ModelAndView inicioPostulante(){	
		ModelAndView model = new ModelAndView();
		model.addObject("postulanteobj",new PostulanteImplLocal().getPostulantes());
		model.setViewName("postulanteRender");
		return model;
	}	
}		

package com.cenfotec.componentes;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cenfotec.componentes.beans.PasatiemposBean;
import com.cenfotec.componentes.beans.PrimerBean;

@Controller
public class PasatiemposController {

	private static final Logger logger = LoggerFactory.getLogger(PasatiemposController.class);

	@Autowired
	private PasatiemposBean misPasatiempos;
	
	
	@RequestMapping(value = "/pasatiempos", method = RequestMethod.GET)
	public String pasatiempos(Locale locale, Model model) {
		logger.info("Welcome to pasatiempos! The client locale is {}.", locale);		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
			
		misPasatiempos = new PasatiemposBean();
		
		misPasatiempos.addToList("Hacer ejercicio");
		misPasatiempos.addToList("Andar en moto");
		misPasatiempos.addToList("Senderismo");
		misPasatiempos.addToList("Visitar la playa");
		misPasatiempos.addToList("Leer");
		misPasatiempos.addToList("Ver películas, series y animé");
		misPasatiempos.addToList("Jugar juegos de mesa");
		misPasatiempos.setStringList();
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("Pasatiempos", misPasatiempos);	
		
		return "pasatiempos";
	}
	
	
}

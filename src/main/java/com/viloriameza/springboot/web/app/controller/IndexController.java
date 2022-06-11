package com.viloriameza.springboot.web.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viloriameza.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app") // Ruta de primer nivel
public class IndexController {
	
	@RequestMapping({"/perfil" , "/profile"})
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Nombre de la persona");
		usuario.setApellido("Apellido de la persona");
		
		model.addAttribute("titulo", "Perfil: ".concat(usuario.getNombre()));
		model.addAttribute("usuario", usuario);
		
		return "perfil";
	}
	
	/**
	 * Pasar datos directamente a la vista con Model
	 */
	@GetMapping( {"" , "/" , "/index" , "/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Model - Spring Framework 5 & Spring Boot 2 desde cero a experto 2022");
		
		return "index";
	}
	
	/**
	 * Pasar datos directamente a la vista con ModelAndView
	 */
	/*@GetMapping( {"/" , "/index" , "/home"})
	public ModelAndView index(ModelAndView mv) {
		
		mv.addObject("titulo", "ModelAndView - Spring Framework 5 & Spring Boot 2 desde cero a experto 2022");
		mv.setViewName("index");
		return mv;
	}*/
	
	/**
	 * Pasar datos directamente a la vista con ModelMap
	 */
	/*@GetMapping( {"/" , "/index" , "/home"})
	public String index(Map<String, Object> model) {
		
		model.put("titulo", "Map - Spring Framework 5 & Spring Boot 2 desde cero a experto 2022");
		
		return "index";
	}*/
	
	
	/**
	 * Pasar datos directamente a la vista con ModelMap
	 */
	/*@GetMapping( {"/" , "/index" , "/home"})
	public String index(ModelMap model) {
		
		model.addAttribute("titulo", "ModelMap - Spring Framework 5 & Spring Boot 2 desde cero a experto 2022");
		
		return "index";
	}*/	
	
	
	/**
	 * Metodo inicial para responder con una vista a una petición
	 */
	
	/*@GetMapping( {"/" , "/index" , "/home"})
	public String index() {
		return "index";
	}*/

}

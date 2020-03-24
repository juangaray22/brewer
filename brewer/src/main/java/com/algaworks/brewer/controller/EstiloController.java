package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author JGaray
 *
 */
@Controller
public class EstiloController {

	@RequestMapping("/estilos/novo")
	public String novo() {
		return "estilo/CadastroEstilo";
	}
}

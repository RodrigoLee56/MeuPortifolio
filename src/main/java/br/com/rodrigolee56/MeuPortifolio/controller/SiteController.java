package br.com.rodrigolee56.MeuPortifolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/projetos")
	public String projetos(Model model) {
		return "projetos";
	}

	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}

}

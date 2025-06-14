package br.com.rodrigolee56.MeuPortifolio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.rodrigolee56.MeuPortifolio.model.Projeto;

@Controller
public class SiteController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/projetos")
	public String projetos(Model model) {
		List<Projeto> projetos = Arrays.asList(
				new Projeto("Projeto 1", "Projeto 1",
						"https://github.com/RodrigoLee56/projeto1"),
				new Projeto("Projeto 2", "Projeto 2",
						"https://github.com/RodrigoLee56/projeto2"));
		model.addAttribute("projetos", projetos);
		return "projetos";
	}

	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}

}

package br.com.rodrigolee56.MeuPortifolio.controller;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatoController {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private Environment env;

	@PostMapping("/enviar-mensagem")
	public ModelAndView enviarMensagem(
			@RequestParam("nome") String nome,
			@RequestParam("email") String email,
			@RequestParam("mensagem") String mensagem) throws MessagingException {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setFrom(email);
			helper.setTo(env.getProperty("spring.mail.username"));
			helper.setSubject("Nova mensagem de " + nome);
			helper.setText(
					"<strong>De:</strong> " +
							email +
							"<br><br>" +
							"<strong>Mensagem:</strong><br>" +
							mensagem,
					true);

			mailSender.send(message);

			return new ModelAndView("redirect:/contato?sucesso=true");
		} catch (MessagingException e) {
			e.printStackTrace();
			return new ModelAndView("redirect:/contato?erro=true");
		}
	}
}

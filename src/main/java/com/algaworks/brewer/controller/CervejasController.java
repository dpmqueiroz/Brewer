package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(cerveja);
		}		
		//Salvar no banco de dados
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");

		return "redirect:/cervejas/novo";
	}
	/* ######################################            SOMENTE PARA TESTAR O HTML                  ############################################  */
	@RequestMapping("/clientes/novo")
	public String novo2() {
		return "cliente/CadastroCliente";
	}
	
	@RequestMapping("/usuarios/novo")
	public String novo4() {
		return "usuario/CadastroUsuario";
	}
	
	@RequestMapping("/cidades/novo")
	public String novo5() {
		return "cidade/CadastroCidade";
	}
	
	@RequestMapping("/estilos/novo")
	public String novo6() {
		return "estilo/CadastroEstilo";
	}
	/* ##########################################################################################################################################  */
}



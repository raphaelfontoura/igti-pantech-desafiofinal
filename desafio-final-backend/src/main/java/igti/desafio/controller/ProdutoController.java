package igti.desafio.controller;

import java.util.Collections;
import java.util.List;

import igti.desafio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import igti.desafio.modelo.Produto;

@RestController
@Transactional
@RequestMapping("/cardapio")
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@GetMapping
	public List<Produto> listaProdutos() {

		return service.findAll();
	} 
}

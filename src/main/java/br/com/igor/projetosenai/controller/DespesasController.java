package br.com.igor.projetosenai.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import br.com.igor.projetosenai.model.Despesas;
import br.com.igor.projetosenai.repository.DespesaRepository;


@Controller
public class DespesasController {
//OBJETO C OPERAÇÕES PARA MANIPULAR OS DADOS NO BD
	
// essa anotação cria o objeto e injeta no atributo e cuida dele 'repositorio'
	@Autowired
	private DespesaRepository repositorio;

	
//	pagina inicial
	@GetMapping("/inicio")
	public String paginaInicial() {
	return "index.html";
		}


//pagina da lista
	@GetMapping("/lista")
	public String listaDespesas(Model model) {
	List<Despesas> despesas = repositorio.findAll();
	model.addAttribute("despesas", despesas);
	
	// Calcular o valor total para cada categoria (ND04, ND30, ND33, ND36, ND39, ND40, ND52) em todos os meses (janeiro a dezembro)
	double valorTotalJaneiro = despesas.stream()
	    .mapToDouble(despesa -> despesa.getJan_nd04() + despesa.getJan_nd30() + despesa.getJan_nd33() + despesa.getJan_nd36() +
	                         despesa.getJan_nd39() + despesa.getJan_nd40() + despesa.getJan_nd52())
	    .sum();

	double valorTotalFevereiro = despesas.stream()
	    .mapToDouble(despesa -> despesa.getFev_nd04() + despesa.getFev_nd30() + despesa.getFev_nd33() + despesa.getFev_nd36() +
	                         despesa.getFev_nd39() + despesa.getFev_nd40() + despesa.getFev_nd52())
	    .sum();

	double valorTotalMarco = despesas.stream()
	    .mapToDouble(despesa -> despesa.getMar_nd04() + despesa.getMar_nd30() + despesa.getMar_nd33() + despesa.getMar_nd36() +
	                         despesa.getMar_nd39() + despesa.getMar_nd40() + despesa.getMar_nd52())
	    .sum();

	double valorTotalAbril = despesas.stream()
		    .mapToDouble(despesa -> despesa.getAbr_nd04() + despesa.getAbr_nd30() + despesa.getAbr_nd33() + despesa.getAbr_nd36() +
		                         despesa.getAbr_nd39() + despesa.getAbr_nd40() + despesa.getAbr_nd52())
		    .sum();

    

	
// Calcular o valor total das despesas
	double valorTotal = despesas.stream().mapToDouble(Despesas::getValor).sum();
	model.addAttribute("valorTotal", valorTotal);
	return "lista";	
		}		
		
	
	
	// pagina de cadastro
	@GetMapping("/cadastro")
	public String cadastrarv() {
	return "cadastroDeValores.html";
		}
	
//metodo para cadastrar qed	
	@PostMapping("/cadastrarDespesa")
	public String cadastroDespesa(@ModelAttibute Despesas despesas,
	BindingResult result, Model model) 
		{
	if(result.hasErrors()) {
	return "/cadastroDeValores";
		}
	
	
	repositorio.save(despesas);
	return "cadastroDeValores.html";
	}	
		
		
//metodo p EDITAR lista despesas
	@GetMapping("/editarListaDespesas")
	public String listaDesepesas(Model model) {
	List<Despesas> despesas = repositorio.findAll();
	model.addAttribute("despesas", despesas);
	return "editarLista";
	}

	
	
//metodo atualizar
	@PostMapping("/atualizar/{id}")
	public String atualizaDespesao(@PathVariable("id")
	long id, @Valid Despesas despesas, BindingResult result, Model model)
		{
	if(result.hasErrors()) {
	despesas.setId(id);
	return "editar_despesa";
		}
	repositorio.save(despesas);
	return "redirect:/editarListaDespesas";
	}
//
	
	
//metodo para salvar
	@PostMapping
	public void salvar(Despesas despesas) {
	repositorio.save(despesas);
	}
//
	
	
	
//metodo para editar
	@GetMapping("/editar/{id}")
	public String editarDespesa(
	@PathVariable ("id") long id, Model model) {
	Despesas despesas = repositorio.findById(id)
	.orElseThrow(() -> new IllegalArgumentException("Identificador não é válido" + id));
	model.addAttribute("despesas", despesas);
	return "editar_despesa";
	}
//	
	
	
	
//metodo para excluir
	@GetMapping("/deletar/{id}")
	public String deletarDespesa(
	@PathVariable("id") long id, Model model) {
	Despesas despesas = repositorio.findById(id)
	.orElseThrow(() -> new IllegalArgumentException("Identificador não é válido" + id));
	repositorio.delete(despesas);
	return "redirect:/editarListaDespesas";
}

	
}





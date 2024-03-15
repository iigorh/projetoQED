package br.com.igor.projetosenai.controller;



import java.util.ArrayList;
import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.igor.projetosenai.model.Despesas;
import br.com.igor.projetosenai.repository.DespesaRepository;


@Controller
public class DespesasController {
//OBJETO C OPERAÇÕES PARA MANIPULAR OS DADOS NO BD
// essa anotação cria o objeto e injeta no atributo e cuida dele 'repositorio' 
	@Autowired
	private DespesaRepository repositorio;

	

	
//tabela de lista
	@GetMapping("/lista")
	public String listaDespesas(Model model) {
	List<Despesas> despesas = repositorio.findAll();
	model.addAttribute("despesas", despesas);
	
	
	
	List<Double> valoresNd04 = new ArrayList<>();
	List<Double> valoresNd30 = new ArrayList<>();
	List<Double> valoresNd33 = new ArrayList<>();
	List<Double> valoresNd36 = new ArrayList<>();
	List<Double> valoresNd39 = new ArrayList<>();
	List<Double> valoresNd40 = new ArrayList<>();
	List<Double> valoresNd52 = new ArrayList<>();
	
	
	
	List<Double> valoresJaneiro = new ArrayList<>();
	List<Double> valoresFevereiro = new ArrayList<>();
	List<Double> valoresMarco = new ArrayList<>();
	List<Double> valoresAbril = new ArrayList<>();
	List<Double> valoresMaio = new ArrayList<>();
	List<Double> valoresJunho = new ArrayList<>();
	List<Double> valoresJulho = new ArrayList<>();
	List<Double> valoresAgosto = new ArrayList<>();
	List<Double> valoresSetembro = new ArrayList<>();
	List<Double> valoresOutubro = new ArrayList<>();
	List<Double> valoresNovembro = new ArrayList<>();
	List<Double> valoresDezembro = new ArrayList<>();
	
	 for (Despesas despesa : despesas) {
	        valoresJaneiro.add(despesa.getJan_nd04() + despesa.getJan_nd30() + despesa.getJan_nd33() + despesa.getJan_nd36() +
	            despesa.getJan_nd39() + despesa.getJan_nd40() + despesa.getJan_nd52());
	 }
	        
	 for (Despesas despesa : despesas) {
	        valoresFevereiro.add(despesa.getFev_nd04() + despesa.getFev_nd30() + despesa.getFev_nd33() + despesa.getFev_nd36() +
	             despesa.getFev_nd39() + despesa.getFev_nd40() + despesa.getFev_nd52());
	 }
	
	 for (Despesas despesa : despesas) {
		    valoresMarco.add(despesa.getMar_nd04() + despesa.getMar_nd30() + despesa.getMar_nd33() + despesa.getMar_nd36() +
		         despesa.getMar_nd39() + despesa.getMar_nd40() + despesa.getMar_nd52()); 
	 }
		    
	 for (Despesas despesa : despesas) {
		       valoresAbril.add(despesa.getAbr_nd04() + despesa.getAbr_nd30() + despesa.getAbr_nd33() + despesa.getAbr_nd36() +
				 despesa.getAbr_nd39() + despesa.getAbr_nd40() + despesa.getAbr_nd52());
	 }
				    
	 for (Despesas despesa : despesas) {
			   valoresMaio.add(despesa.getMai_nd04() + despesa.getMai_nd30() + despesa.getMai_nd33() + despesa.getMai_nd36() +
			    despesa.getMai_nd39() + despesa.getMai_nd40() + despesa.getMai_nd52());
	 }
					    
	 for (Despesas despesa : despesas) {
			   valoresJunho.add(despesa.getJun_nd04() + despesa.getJun_nd30() + despesa.getJun_nd33() + despesa.getJun_nd36() +
				 despesa.getJun_nd39() + despesa.getJun_nd40() + despesa.getJun_nd52());
	 }
						    
	 for (Despesas despesa : despesas) {
			   valoresJulho.add(despesa.getJul_nd04() + despesa.getJul_nd30() + despesa.getJul_nd33() + despesa.getJul_nd36() +
				 despesa.getJul_nd39() + despesa.getJul_nd40() + despesa.getJul_nd52());
	 }
							    
	 for (Despesas despesa : despesas) {
			   valoresAgosto.add(despesa.getAgo_nd04() + despesa.getAgo_nd30() + despesa.getAgo_nd33() + despesa.getAgo_nd36() +
				  despesa.getAgo_nd39() + despesa.getAgo_nd40() + despesa.getAgo_nd52());
	 }
			   
	for (Despesas despesa : despesas) {
				   valoresSetembro.add(despesa.getSet_nd04() + despesa.getSet_nd30() + despesa.getSet_nd33() + despesa.getSet_nd36() +
					  despesa.getSet_nd39() + despesa.getSet_nd40() + despesa.getSet_nd52());
	}
				   
	for (Despesas despesa : despesas) {
			   valoresOutubro.add(despesa.getOut_nd04() + despesa.getOut_nd30() + despesa.getOut_nd33() + despesa.getOut_nd36() +
				 despesa.getOut_nd39() + despesa.getOut_nd40() + despesa.getOut_nd52());
	}

    for (Despesas despesa : despesas) {
			  valoresNovembro.add(despesa.getNov_nd04() + despesa.getNov_nd30() + despesa.getNov_nd33() + despesa.getNov_nd36() +
			 despesa.getNov_nd39() + despesa.getNov_nd40() + despesa.getNov_nd52());
    }
				   
	for (Despesas despesa : despesas) {
			   valoresDezembro.add(despesa.getDez_nd04() + despesa.getDez_nd30() + despesa.getDez_nd33() + despesa.getDez_nd36() +
				 despesa.getDez_nd39() + despesa.getDez_nd40() + despesa.getDez_nd52());
	}
	
	
	 
	return "lista";
			
	
	}
	
	
	
	
	//metodo para cadastrar qed	
		@PostMapping("/cadastrarDespesa")
		public String cadastroDespesa(@ModelAttribute Despesas despesas,
		BindingResult result, Model model) 
			{
		if(result.hasErrors()) {
		return "/cadastroDeValores";
			}
		repositorio.save(despesas);
		return "cadastroDeValores.html";
		}	
		
		
			
	//metodo p editar lista despesas
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
	

	
	
//	pagina inicial
	@GetMapping("/inicio")
	public String paginaInicial() {
	return "index.html";
		}	
	
	
// pagina de cadastro
	@GetMapping("/cadastro")
	public String cadastrarv() {
	return "cadastroDeValores.html";
		}
	


	
}





package br.com.igor.projetosenai.controller;



import java.util.List;
import java.util.stream.Collectors;

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

	List<Double> valoresJaneiro04 = despesas.stream().map((Despesas despesa) -> despesa.getJan_nd04()).collect(Collectors.toList());
	List<Double> valoresFevereiro04 = despesas.stream().map((Despesas despesa) -> despesa.getFev_nd04()).collect(Collectors.toList());
	List<Double> valoresMarco04 = despesas.stream().map((Despesas despesa) -> despesa.getMar_nd04()).collect(Collectors.toList());
	List<Double> valoresAbril04 = despesas.stream().map((Despesas despesa) -> despesa.getAbr_nd04()).collect(Collectors.toList());
	List<Double> valoresMaio04 = despesas.stream().map((Despesas despesa) -> despesa.getMai_nd04()).collect(Collectors.toList());
	List<Double> valoresJunho04 = despesas.stream().map((Despesas despesa) -> despesa.getJun_nd04()).collect(Collectors.toList());
	List<Double> valoresJulho04 = despesas.stream().map((Despesas despesa) -> despesa.getJul_nd04()).collect(Collectors.toList());
	List<Double> valoresAgosto04 = despesas.stream().map((Despesas despesa) -> despesa.getAgo_nd04()).collect(Collectors.toList());
	List<Double> valoresSetembro04 = despesas.stream().map((Despesas despesa) -> despesa.getSet_nd04()).collect(Collectors.toList());
	List<Double> valoresOutubro04 = despesas.stream().map((Despesas despesa) -> despesa.getOut_nd04()).collect(Collectors.toList());
	List<Double> valoresNovembro04 = despesas.stream().map((Despesas despesa) -> despesa.getNov_nd04()).collect(Collectors.toList());
	List<Double> valoresDezembro04 = despesas.stream().map((Despesas despesa) -> despesa.getDez_nd04()).collect(Collectors.toList());
	model.addAttribute("valorJan04", valoresJaneiro04);
	model.addAttribute("valorFev04", valoresFevereiro04);
	model.addAttribute("valorMar04", valoresMarco04);
	model.addAttribute("valorAbr04", valoresAbril04);
	model.addAttribute("valorMai04", valoresMaio04);
	model.addAttribute("valorJun04", valoresJunho04);
	model.addAttribute("valorJul04", valoresJulho04);
	model.addAttribute("valorAgo04", valoresAgosto04);
	model.addAttribute("valorSet04", valoresSetembro04);
	model.addAttribute("valorOut04", valoresOutubro04);
	model.addAttribute("valorNov04", valoresNovembro04);
	model.addAttribute("valorDez04", valoresDezembro04);
	
		
	List<Double> valoresJaneiro30 = despesas.stream().map((Despesas despesa) -> despesa.getJan_nd30()).collect(Collectors.toList());
	List<Double> valoresFevereiro30 = despesas.stream().map((Despesas despesa) -> despesa.getFev_nd30()).collect(Collectors.toList());
	List<Double> valoresMarco30 = despesas.stream().map((Despesas despesa) -> despesa.getMar_nd30()).collect(Collectors.toList());
	List<Double> valoresAbril30 = despesas.stream().map((Despesas despesa) -> despesa.getAbr_nd30()).collect(Collectors.toList());
	List<Double> valoresMaio30 = despesas.stream().map((Despesas despesa) -> despesa.getMai_nd30()).collect(Collectors.toList());
	List<Double> valoresJunho30 = despesas.stream().map((Despesas despesa) -> despesa.getJun_nd30()).collect(Collectors.toList());
	List<Double> valoresJulho30 = despesas.stream().map((Despesas despesa) -> despesa.getJul_nd30()).collect(Collectors.toList());
	List<Double> valoresAgosto30 = despesas.stream().map((Despesas despesa) -> despesa.getAgo_nd30()).collect(Collectors.toList());
	List<Double> valoresSetembro30 = despesas.stream().map((Despesas despesa) -> despesa.getSet_nd30()).collect(Collectors.toList());
	List<Double> valoresOutubro30 = despesas.stream().map((Despesas despesa) -> despesa.getOut_nd30()).collect(Collectors.toList());
	List<Double> valoresNovembro30 = despesas.stream().map((Despesas despesa) -> despesa.getNov_nd30()).collect(Collectors.toList());
	List<Double> valoresDezembro30 = despesas.stream().map((Despesas despesa) -> despesa.getDez_nd30()).collect(Collectors.toList());
	model.addAttribute("valorJan30", valoresJaneiro30);
	model.addAttribute("valorFev30", valoresFevereiro30);
	model.addAttribute("valorMar30", valoresMarco30);
	model.addAttribute("valorAbr30", valoresAbril30);
	model.addAttribute("valorMai30", valoresMaio30);
	model.addAttribute("valorJun30", valoresJunho30);
	model.addAttribute("valorJul30", valoresJulho30);
	model.addAttribute("valorAgo30", valoresAgosto30);
	model.addAttribute("valorSet30", valoresSetembro30);
	model.addAttribute("valorOut30", valoresOutubro30);
	model.addAttribute("valorNov30", valoresNovembro30);
	model.addAttribute("valorDez30", valoresDezembro30);
	
	
	
	
	
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
	public String cadastroDespesa(@ModelAttribute Despesas despesas,
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





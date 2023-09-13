package br.com.igor.projetosenai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//ESTA ANOTAÇÃO DEFINE A CLASSE COMO ENTIDADE (PARA AUTO CRIAR NO BD UMA TABELA)
@Entity
public class Despesas {

// AS 2 ANOTAÇÕES SÃO PARA GERAR ID AUTOMATICO, A PRIMEIRA PARA INDICAR O TIPO
//	A SEGUNDA ESCOLHE O TIPO DE IMPLEMENTAÇÃO DO DADO
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String categoria;
	private double valor;

	private double jan_nd04;
	private double jan_nd30;
	private double jan_nd33;
	private double jan_nd36;
	private double jan_nd39;
	private double jan_nd40;
	private double jan_nd52;

	private double fev_nd04;
	private double fev_nd30;
	private double fev_nd33;
	private double fev_nd36;
	private double fev_nd39;
	private double fev_nd40;
	private double fev_nd52;

	private double mar_nd04;
	private double mar_nd30;
	private double mar_nd33;
	private double mar_nd36;
	private double mar_nd39;
	private double mar_nd40;
	private double mar_nd52;

	private double abr_nd04;
	private double abr_nd30;
	private double abr_nd33;
	private double abr_nd36;
	private double abr_nd39;
	private double abr_nd40;
	private double abr_nd52;

	private double mai_nd04;
	private double mai_nd30;
	private double mai_nd33;
	private double mai_nd36;
	private double mai_nd39;
	private double mai_nd40;
	private double mai_nd52;

	private double jun_nd04;
	private double jun_nd30;
	private double jun_nd33;
	private double jun_nd36;
	private double jun_nd39;
	private double jun_nd40;
	private double jun_nd52;

	private double jul_nd04;
	private double jul_nd30;
	private double jul_nd33;
	private double jul_nd36;
	private double jul_nd39;
	private double jul_nd40;
	private double jul_nd52;

	private double ago_nd04;
	private double ago_nd30;
	private double ago_nd33;
	private double ago_nd36;
	private double ago_nd39;
	private double ago_nd40;
	private double ago_nd52;

	private double set_nd04;
	private double set_nd30;
	private double set_nd33;
	private double set_nd36;
	private double set_nd39;
	private double set_nd40;
	private double set_nd52;

	private double out_nd04;
	private double out_nd30;
	private double out_nd33;
	private double out_nd36;
	private double out_nd39;
	private double out_nd40;
	private double out_nd52;

	private double nov_nd04;
	private double nov_nd30;
	private double nov_nd33;
	private double nov_nd36;
	private double nov_nd39;
	private double nov_nd40;
	private double nov_nd52;

	private double dez_nd04;
	private double dez_nd30;
	private double dez_nd33;
	private double dez_nd36;
	private double dez_nd39;
	private double dez_nd40;
	private double dez_nd52;

	public Despesas() {

	}

	public Despesas(Long id, String nome, String categoria, double valor, double jan_nd04, double jan_nd30,
			double jan_nd33, double jan_nd36, double jan_nd39, double jan_nd40, double jan_nd52, double fev_nd04,
			double fev_nd30, double fev_nd33, double fev_nd36, double fev_nd39, double fev_nd40, double fev_nd52,
			double mar_nd04, double mar_nd30, double mar_nd33, double mar_nd36, double mar_nd39, double mar_nd40,
			double mar_nd52, double abr_nd04, double abr_nd30, double abr_nd33, double abr_nd36, double abr_nd39,
			double abr_nd40, double abr_nd52, double mai_nd04, double mai_nd30, double mai_nd33, double mai_nd36,
			double mai_nd39, double mai_nd40, double mai_nd52, double jun_nd04, double jun_nd30, double jun_nd33,
			double jun_nd36, double jun_nd39, double jun_nd40, double jun_nd52, double jul_nd04, double jul_nd30,
			double jul_nd33, double jul_nd36, double jul_nd39, double jul_nd40, double jul_nd52, double ago_nd04,
			double ago_nd30, double ago_nd33, double ago_nd36, double ago_nd39, double ago_nd40, double ago_nd52,
			double set_nd04, double set_nd30, double set_nd33, double set_nd36, double set_nd39, double set_nd40,
			double set_nd52, double out_nd04, double out_nd30, double out_nd33, double out_nd36, double out_nd39,
			double out_nd40, double out_nd52, double nov_nd04, double nov_nd30, double nov_nd33, double nov_nd36,
			double nov_nd39, double nov_nd40, double nov_nd52, double dez_nd04, double dez_nd30, double dez_nd33,
			double dez_nd36, double dez_nd39, double dez_nd40, double dez_nd52) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
		this.jan_nd04 = jan_nd04;
		this.jan_nd30 = jan_nd30;
		this.jan_nd33 = jan_nd33;
		this.jan_nd36 = jan_nd36;
		this.jan_nd39 = jan_nd39;
		this.jan_nd40 = jan_nd40;
		this.jan_nd52 = jan_nd52;
		this.fev_nd04 = fev_nd04;
		this.fev_nd30 = fev_nd30;
		this.fev_nd33 = fev_nd33;
		this.fev_nd36 = fev_nd36;
		this.fev_nd39 = fev_nd39;
		this.fev_nd40 = fev_nd40;
		this.fev_nd52 = fev_nd52;
		this.mar_nd04 = mar_nd04;
		this.mar_nd30 = mar_nd30;
		this.mar_nd33 = mar_nd33;
		this.mar_nd36 = mar_nd36;
		this.mar_nd39 = mar_nd39;
		this.mar_nd40 = mar_nd40;
		this.mar_nd52 = mar_nd52;
		this.abr_nd04 = abr_nd04;
		this.abr_nd30 = abr_nd30;
		this.abr_nd33 = abr_nd33;
		this.abr_nd36 = abr_nd36;
		this.abr_nd39 = abr_nd39;
		this.abr_nd40 = abr_nd40;
		this.abr_nd52 = abr_nd52;
		this.mai_nd04 = mai_nd04;
		this.mai_nd30 = mai_nd30;
		this.mai_nd33 = mai_nd33;
		this.mai_nd36 = mai_nd36;
		this.mai_nd39 = mai_nd39;
		this.mai_nd40 = mai_nd40;
		this.mai_nd52 = mai_nd52;
		this.jun_nd04 = jun_nd04;
		this.jun_nd30 = jun_nd30;
		this.jun_nd33 = jun_nd33;
		this.jun_nd36 = jun_nd36;
		this.jun_nd39 = jun_nd39;
		this.jun_nd40 = jun_nd40;
		this.jun_nd52 = jun_nd52;
		this.jul_nd04 = jul_nd04;
		this.jul_nd30 = jul_nd30;
		this.jul_nd33 = jul_nd33;
		this.jul_nd36 = jul_nd36;
		this.jul_nd39 = jul_nd39;
		this.jul_nd40 = jul_nd40;
		this.jul_nd52 = jul_nd52;
		this.ago_nd04 = ago_nd04;
		this.ago_nd30 = ago_nd30;
		this.ago_nd33 = ago_nd33;
		this.ago_nd36 = ago_nd36;
		this.ago_nd39 = ago_nd39;
		this.ago_nd40 = ago_nd40;
		this.ago_nd52 = ago_nd52;
		this.set_nd04 = set_nd04;
		this.set_nd30 = set_nd30;
		this.set_nd33 = set_nd33;
		this.set_nd36 = set_nd36;
		this.set_nd39 = set_nd39;
		this.set_nd40 = set_nd40;
		this.set_nd52 = set_nd52;
		this.out_nd04 = out_nd04;
		this.out_nd30 = out_nd30;
		this.out_nd33 = out_nd33;
		this.out_nd36 = out_nd36;
		this.out_nd39 = out_nd39;
		this.out_nd40 = out_nd40;
		this.out_nd52 = out_nd52;
		this.nov_nd04 = nov_nd04;
		this.nov_nd30 = nov_nd30;
		this.nov_nd33 = nov_nd33;
		this.nov_nd36 = nov_nd36;
		this.nov_nd39 = nov_nd39;
		this.nov_nd40 = nov_nd40;
		this.nov_nd52 = nov_nd52;
		this.dez_nd04 = dez_nd04;
		this.dez_nd30 = dez_nd30;
		this.dez_nd33 = dez_nd33;
		this.dez_nd36 = dez_nd36;
		this.dez_nd39 = dez_nd39;
		this.dez_nd40 = dez_nd40;
		this.dez_nd52 = dez_nd52;

	}

	public double getJan_nd04() {
		return jan_nd04;
	}

	public void setJan_nd04(double jan_nd04) {
		this.jan_nd04 = jan_nd04;
	}

	public double getJan_nd30() {
		return jan_nd30;
	}

	public void setJan_nd30(double jan_nd30) {
		this.jan_nd30 = jan_nd30;
	}

	public double getJan_nd33() {
		return jan_nd33;
	}

	public void setJan_nd33(double jan_nd33) {
		this.jan_nd33 = jan_nd33;
	}

	public double getJan_nd36() {
		return jan_nd36;
	}

	public void setJan_nd36(double jan_nd36) {
		this.jan_nd36 = jan_nd36;
	}

	public double getJan_nd39() {
		return jan_nd39;
	}

	public void setJan_nd39(double jan_nd39) {
		this.jan_nd39 = jan_nd39;
	}

	public double getJan_nd40() {
		return jan_nd40;
	}

	public void setJan_nd40(double jan_nd40) {
		this.jan_nd40 = jan_nd40;
	}

	public double getJan_nd52() {
		return jan_nd52;
	}

	public void setJan_nd52(double jan_nd52) {
		this.jan_nd52 = jan_nd52;
	}

	public double getFev_nd04() {
		return fev_nd04;
	}

	public void setFev_nd04(double fev_nd04) {
		this.fev_nd04 = fev_nd04;
	}

	public double getFev_nd30() {
		return fev_nd30;
	}

	public void setFev_nd30(double fev_nd30) {
		this.fev_nd30 = fev_nd30;
	}

	public double getFev_nd33() {
		return fev_nd33;
	}

	public void setFev_nd33(double fev_nd33) {
		this.fev_nd33 = fev_nd33;
	}

	public double getFev_nd36() {
		return fev_nd36;
	}

	public void setFev_nd36(double fev_nd36) {
		this.fev_nd36 = fev_nd36;
	}

	public double getFev_nd39() {
		return fev_nd39;
	}

	public void setFev_nd39(double fev_nd39) {
		this.fev_nd39 = fev_nd39;
	}

	public double getFev_nd40() {
		return fev_nd40;
	}

	public void setFev_nd40(double fev_nd40) {
		this.fev_nd40 = fev_nd40;
	}

	public double getFev_nd52() {
		return fev_nd52;
	}

	public void setFev_nd52(double fev_nd52) {
		this.fev_nd52 = fev_nd52;
	}

	public double getMar_nd04() {
		return mar_nd04;
	}

	public void setMar_nd04(double mar_nd04) {
		this.mar_nd04 = mar_nd04;
	}

	public double getMar_nd30() {
		return mar_nd30;
	}

	public void setMar_nd30(double mar_nd30) {
		this.mar_nd30 = mar_nd30;
	}

	public double getMar_nd33() {
		return mar_nd33;
	}

	public void setMar_nd33(double mar_nd33) {
		this.mar_nd33 = mar_nd33;
	}

	public double getMar_nd36() {
		return mar_nd36;
	}

	public void setMar_nd36(double mar_nd36) {
		this.mar_nd36 = mar_nd36;
	}

	public double getMar_nd39() {
		return mar_nd39;
	}

	public void setMar_nd39(double mar_nd39) {
		this.mar_nd39 = mar_nd39;
	}

	public double getMar_nd40() {
		return mar_nd40;
	}

	public void setMar_nd40(double mar_nd40) {
		this.mar_nd40 = mar_nd40;
	}

	public double getMar_nd52() {
		return mar_nd52;
	}

	public void setMar_nd52(double mar_nd52) {
		this.mar_nd52 = mar_nd52;
	}

	public double getAbr_nd04() {
		return abr_nd04;
	}

	public void setAbr_nd04(double abr_nd04) {
		this.abr_nd04 = abr_nd04;
	}

	public double getAbr_nd30() {
		return abr_nd30;
	}

	public void setAbr_nd30(double abr_nd30) {
		this.abr_nd30 = abr_nd30;
	}

	public double getAbr_nd33() {
		return abr_nd33;
	}

	public void setAbr_nd33(double abr_nd33) {
		this.abr_nd33 = abr_nd33;
	}

	public double getAbr_nd36() {
		return abr_nd36;
	}

	public void setAbr_nd36(double abr_nd36) {
		this.abr_nd36 = abr_nd36;
	}

	public double getAbr_nd39() {
		return abr_nd39;
	}

	public void setAbr_nd39(double abr_nd39) {
		this.abr_nd39 = abr_nd39;
	}

	public double getAbr_nd40() {
		return abr_nd40;
	}

	public void setAbr_nd40(double abr_nd40) {
		this.abr_nd40 = abr_nd40;
	}

	public double getAbr_nd52() {
		return abr_nd52;
	}

	public void setAbr_nd52(double abr_nd52) {
		this.abr_nd52 = abr_nd52;
	}

	public double getMai_nd04() {
		return mai_nd04;
	}

	public void setMai_nd04(double mai_nd04) {
		this.mai_nd04 = mai_nd04;
	}

	public double getMai_nd30() {
		return mai_nd30;
	}

	public void setMai_nd30(double mai_nd30) {
		this.mai_nd30 = mai_nd30;
	}

	public double getMai_nd33() {
		return mai_nd33;
	}

	public void setMai_nd33(double mai_nd33) {
		this.mai_nd33 = mai_nd33;
	}

	public double getMai_nd36() {
		return mai_nd36;
	}

	public void setMai_nd36(double mai_nd36) {
		this.mai_nd36 = mai_nd36;
	}

	public double getMai_nd39() {
		return mai_nd39;
	}

	public void setMai_nd39(double mai_nd39) {
		this.mai_nd39 = mai_nd39;
	}

	public double getMai_nd40() {
		return mai_nd40;
	}

	public void setMai_nd40(double mai_nd40) {
		this.mai_nd40 = mai_nd40;
	}

	public double getMai_nd52() {
		return mai_nd52;
	}

	public void setMai_nd52(double mai_nd52) {
		this.mai_nd52 = mai_nd52;
	}

	public double getJun_nd04() {
		return jun_nd04;
	}

	public void setJun_nd04(double jun_nd04) {
		this.jun_nd04 = jun_nd04;
	}

	public double getJun_nd30() {
		return jun_nd30;
	}

	public void setJun_nd30(double jun_nd30) {
		this.jun_nd30 = jun_nd30;
	}

	public double getJun_nd33() {
		return jun_nd33;
	}

	public void setJun_nd33(double jun_nd33) {
		this.jun_nd33 = jun_nd33;
	}

	public double getJun_nd36() {
		return jun_nd36;
	}

	public void setJun_nd36(double jun_nd36) {
		this.jun_nd36 = jun_nd36;
	}

	public double getJun_nd39() {
		return jun_nd39;
	}

	public void setJun_nd39(double jun_nd39) {
		this.jun_nd39 = jun_nd39;
	}

	public double getJun_nd40() {
		return jun_nd40;
	}

	public void setJun_nd40(double jun_nd40) {
		this.jun_nd40 = jun_nd40;
	}

	public double getJun_nd52() {
		return jun_nd52;
	}

	public void setJun_nd52(double jun_nd52) {
		this.jun_nd52 = jun_nd52;
	}

	public double getJul_nd04() {
		return jul_nd04;
	}

	public void setJul_nd04(double jul_nd04) {
		this.jul_nd04 = jul_nd04;
	}

	public double getJul_nd30() {
		return jul_nd30;
	}

	public void setJul_nd30(double jul_nd30) {
		this.jul_nd30 = jul_nd30;
	}

	public double getJul_nd33() {
		return jul_nd33;
	}

	public void setJul_nd33(double jul_nd33) {
		this.jul_nd33 = jul_nd33;
	}

	public double getJul_nd36() {
		return jul_nd36;
	}

	public void setJul_nd36(double jul_nd36) {
		this.jul_nd36 = jul_nd36;
	}

	public double getJul_nd39() {
		return jul_nd39;
	}

	public void setJul_nd39(double jul_nd39) {
		this.jul_nd39 = jul_nd39;
	}

	public double getJul_nd40() {
		return jul_nd40;
	}

	public void setJul_nd40(double jul_nd40) {
		this.jul_nd40 = jul_nd40;
	}

	public double getJul_nd52() {
		return jul_nd52;
	}

	public void setJul_nd52(double jul_nd52) {
		this.jul_nd52 = jul_nd52;
	}

	public double getAgo_nd04() {
		return ago_nd04;
	}

	public void setAgo_nd04(double ago_nd04) {
		this.ago_nd04 = ago_nd04;
	}

	public double getAgo_nd30() {
		return ago_nd30;
	}

	public void setAgo_nd30(double ago_nd30) {
		this.ago_nd30 = ago_nd30;
	}

	public double getAgo_nd33() {
		return ago_nd33;
	}

	public void setAgo_nd33(double ago_nd33) {
		this.ago_nd33 = ago_nd33;
	}

	public double getAgo_nd36() {
		return ago_nd36;
	}

	public void setAgo_nd36(double ago_nd36) {
		this.ago_nd36 = ago_nd36;
	}

	public double getAgo_nd39() {
		return ago_nd39;
	}

	public void setAgo_nd39(double ago_nd39) {
		this.ago_nd39 = ago_nd39;
	}

	public double getAgo_nd40() {
		return ago_nd40;
	}

	public void setAgo_nd40(double ago_nd40) {
		this.ago_nd40 = ago_nd40;
	}

	public double getAgo_nd52() {
		return ago_nd52;
	}

	public void setAgo_nd52(double ago_nd52) {
		this.ago_nd52 = ago_nd52;
	}

	public double getSet_nd04() {
		return set_nd04;
	}

	public void setSet_nd04(double set_nd04) {
		this.set_nd04 = set_nd04;
	}

	public double getSet_nd30() {
		return set_nd30;
	}

	public void setSet_nd30(double set_nd30) {
		this.set_nd30 = set_nd30;
	}

	public double getSet_nd33() {
		return set_nd33;
	}

	public void setSet_nd33(double set_nd33) {
		this.set_nd33 = set_nd33;
	}

	public double getSet_nd36() {
		return set_nd36;
	}

	public void setSet_nd36(double set_nd36) {
		this.set_nd36 = set_nd36;
	}

	public double getSet_nd39() {
		return set_nd39;
	}

	public void setSet_nd39(double set_nd39) {
		this.set_nd39 = set_nd39;
	}

	public double getSet_nd40() {
		return set_nd40;
	}

	public void setSet_nd40(double set_nd40) {
		this.set_nd40 = set_nd40;
	}

	public double getSet_nd52() {
		return set_nd52;
	}

	public void setSet_nd52(double set_nd52) {
		this.set_nd52 = set_nd52;
	}

	public double getOut_nd04() {
		return out_nd04;
	}

	public void setOut_nd04(double out_nd04) {
		this.out_nd04 = out_nd04;
	}

	public double getOut_nd30() {
		return out_nd30;
	}

	public void setOut_nd30(double out_nd30) {
		this.out_nd30 = out_nd30;
	}

	public double getOut_nd33() {
		return out_nd33;
	}

	public void setOut_nd33(double out_nd33) {
		this.out_nd33 = out_nd33;
	}

	public double getOut_nd36() {
		return out_nd36;
	}

	public void setOut_nd36(double out_nd36) {
		this.out_nd36 = out_nd36;
	}

	public double getOut_nd39() {
		return out_nd39;
	}

	public void setOut_nd39(double out_nd39) {
		this.out_nd39 = out_nd39;
	}

	public double getOut_nd40() {
		return out_nd40;
	}

	public void setOut_nd40(double out_nd40) {
		this.out_nd40 = out_nd40;
	}

	public double getOut_nd52() {
		return out_nd52;
	}

	public void setOut_nd52(double out_nd52) {
		this.out_nd52 = out_nd52;
	}

	public double getNov_nd04() {
		return nov_nd04;
	}

	public void setNov_nd04(double nov_nd04) {
		this.nov_nd04 = nov_nd04;
	}

	public double getNov_nd30() {
		return nov_nd30;
	}

	public void setNov_nd30(double nov_nd30) {
		this.nov_nd30 = nov_nd30;
	}

	public double getNov_nd33() {
		return nov_nd33;
	}

	public void setNov_nd33(double nov_nd33) {
		this.nov_nd33 = nov_nd33;
	}

	public double getNov_nd36() {
		return nov_nd36;
	}

	public void setNov_nd36(double nov_nd36) {
		this.nov_nd36 = nov_nd36;
	}

	public double getNov_nd39() {
		return nov_nd39;
	}

	public void setNov_nd39(double nov_nd39) {
		this.nov_nd39 = nov_nd39;
	}

	public double getNov_nd40() {
		return nov_nd40;
	}

	public void setNov_nd40(double nov_nd40) {
		this.nov_nd40 = nov_nd40;
	}

	public double getNov_nd52() {
		return nov_nd52;
	}

	public void setNov_nd52(double nov_nd52) {
		this.nov_nd52 = nov_nd52;
	}

	public double getDez_nd04() {
		return dez_nd04;
	}

	public void setDez_nd04(double dez_nd04) {
		this.dez_nd04 = dez_nd04;
	}

	public double getDez_nd30() {
		return dez_nd30;
	}

	public void setDez_nd30(double dez_nd30) {
		this.dez_nd30 = dez_nd30;
	}

	public double getDez_nd33() {
		return dez_nd33;
	}

	public void setDez_nd33(double dez_nd33) {
		this.dez_nd33 = dez_nd33;
	}

	public double getDez_nd36() {
		return dez_nd36;
	}

	public void setDez_nd36(double dez_nd36) {
		this.dez_nd36 = dez_nd36;
	}

	public double getDez_nd39() {
		return dez_nd39;
	}

	public void setDez_nd39(double dez_nd39) {
		this.dez_nd39 = dez_nd39;
	}

	public double getDez_nd40() {
		return dez_nd40;
	}

	public void setDez_nd40(double dez_nd40) {
		this.dez_nd40 = dez_nd40;
	}

	public double getDez_nd52() {
		return dez_nd52;
	}

	public void setDez_nd52(double dez_nd52) {
		this.dez_nd52 = dez_nd52;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}

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
	private double jan;
	private double fev;
	private double mar;
	private double abr;
	private double mai;
	private double jun;
	private double jul;
	private double ago;
	private double sett;
	private double out;
	private double nov;
	private double dez;
	
	
	public Despesas() {

	}
	
	public Despesas(Long id, String nome, String categoria, double valor, double jan, double fev, double mar, double abr, double mai, double jun, double jul, double ago, double sett, double out, double nov, double dez) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.sett = sett;
        this.out = out;
        this.nov = nov;
        this.dez = dez;
    }

    public double getJan() {
        return jan;
    }

    public void setJan(double jan) {
        this.jan = jan;
    }

    public double getFev() {
        return fev;
    }

    public void setFev(double fev) {
        this.fev = fev;
    }

    public double getMar() {
        return mar;
    }

    public void setMar(double mar) {
        this.mar = mar;
    }

    public double getAbr() {
        return abr;
    }

    public void setAbr(double abr) {
        this.abr = abr;
    }

    public double getMai() {
        return mai;
    }

    public void setMai(double mai) {
        this.mai = mai;
    }

    public double getJun() {
        return jun;
    }

    public void setJun(double jun) {
        this.jun = jun;
    }

    public double getJul() {
        return jul;
    }

    public void setJul(double jul) {
        this.jul = jul;
    }

    public double getAgo() {
        return ago;
    }

    public void setAgo(double ago) {
        this.ago = ago;
    }

    public double getSett() {
        return sett;
    }

    public void setSet(double sett) {
        this.sett = sett;
    }

    public double getOut() {
        return out;
    }

    public void setOut(double out) {
        this.out = out;
    }

    public double getNov() {
        return nov;
    }

    public void setNov(double nov) {
        this.nov = nov;
    }

    public double getDez() {
        return dez;
    }

    public void setDez(double dez) {
        this.dez = dez;
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

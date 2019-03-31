package br.com.fastshop.model;

public class Funcionario {

	private String id;
	private String nome;
	private String rg;
	
	public Funcionario(){}
	
	
	public Funcionario(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
}

	}	
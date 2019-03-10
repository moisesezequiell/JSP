package br.com.fastshop.model;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	
	
	public Produto() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ",  preco=" + preco + "]";
	}
	
	

}

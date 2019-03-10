package br.com.fastshop.service;

import java.util.List;

import br.com.fastshop.model.Produto;

public class ProdutoService {

	public Produto criarPruduto(String nome, Double preco) {

		Produto p1 = new Produto();
		p1.setNome(nome);
		p1.setPreco(preco);
		return p1;

	}

	public void mostrarProduto(List<Produto> produtos) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto produto = produtos.get(i);
			System.out.println("produtos nome" + produto);
		}
	}
}

package br.com.fastshop.service;

import br.com.fastshop.model.Cliente;

public class ClienteService {

	public Cliente criarCliente (String nome, String documento , int idade){
		Cliente c1 = new  Cliente();
		c1.setNome(nome);
		c1.setDocumento(documento);
		c1.setIdade(idade);
		return c1;
		
		
	}

}
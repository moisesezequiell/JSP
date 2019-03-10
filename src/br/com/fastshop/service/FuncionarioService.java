package br.com.fastshop.service;

import br.com.fastshop.model.Funcionario;

public class FuncionarioService {

	
	public Funcionario criarFuncionario (String nome, String cpf) {
	Funcionario f1 = new Funcionario();
	f1.setNome(nome);
	f1.setCpf(cpf);
	return f1;
	}
}

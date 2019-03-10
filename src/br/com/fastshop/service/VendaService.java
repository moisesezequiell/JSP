package br.com.fastshop.service;

import java.util.List;

import br.com.fastshop.model.Cliente;
import br.com.fastshop.model.Funcionario;
import br.com.fastshop.model.Produto;
import br.com.fastshop.model.Venda;

public class VendaService {
	
	public Venda criarVenda (String caixa, double troco, int cnpj, Cliente cliente , List<Produto> produtos , Funcionario funcionario ) {
	
	Venda v1 = new Venda();
	v1.setCnpj(cnpj);
	v1.setCaixa(caixa);
	v1.setTroco(troco);
	v1.setCliente(cliente);
	v1.setFuncionario(funcionario);
	v1.setProdutos(produtos);
	return v1;
	


}
}
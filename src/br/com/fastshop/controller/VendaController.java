package br.com.fastshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

import javax.print.attribute.standard.Sides;

import br.com.fastshop.model.Cliente;
import br.com.fastshop.model.Funcionario;
import br.com.fastshop.model.Produto;
import br.com.fastshop.model.Venda;
import br.com.fastshop.service.ClienteService;
import br.com.fastshop.service.FuncionarioService;
import br.com.fastshop.service.ProdutoService;
import br.com.fastshop.service.VendaService;

public class VendaController {

	public static void main(String[] args) {
	
		ClienteService service = new ClienteService();
		Cliente cliente = service.criarCliente("moises", "387628492", 26);		
		
		FuncionarioService func = new FuncionarioService();
		Funcionario doMes = func.criarFuncionario("Fernanda", "23515161");
				
		ProdutoService produtoService= new ProdutoService();
		Produto arroz = produtoService.criarPruduto("arroz",  09.24);
		Produto batata = produtoService.criarPruduto("batata", 40.0);
		Produto feijao = produtoService.criarPruduto("batata",  09.21);
		
		List<Produto>produtos = new ArrayList<>() ;
		produtos.add(arroz);
		produtos.add(batata);
		produtos.add(feijao);
		
		Venda venda= new Venda();
		venda.setCaixa("caixa");
		venda.setCliente(cliente);
		venda.setCnpj(124215);
		venda.setFuncionario(doMes);;
		venda.setTroco(12.64);
		venda.setProdutos(produtos);

		System.out.println(venda);
		System.out.println(venda.getCliente());
		System.out.println(venda.getFuncionario());
		
		

		produtoService.mostrarProduto(produtos);
		
	
		
	}
}

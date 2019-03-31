package br.com.fastshop.cotroller;

import java.sql.SQLException;
import java.util.List;

import br.com.fastshop.model.Cliente;
import br.com.fastshop.service.ClienteService;

public class ClienteController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Cliente cliente = new Cliente("gordo", "98176897272");
		
		ClienteService service = new ClienteService();
		
		service.salvar(cliente);
		
		List<Cliente> listaDeClientes = service.listaDeClientes();
		for (Cliente c : listaDeClientes) {
			System.out.println("Cliente: "+c.getNome()+" cpf: "+ c.getCpf());
		}
		

	}

}

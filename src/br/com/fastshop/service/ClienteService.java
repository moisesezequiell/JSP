package br.com.fastshop.service;

import java.sql.SQLException;
import java.util.List;

import br.com.fastshop.model.Cliente;
import br.com.fastshop.repository.ClienteRepository;

public class ClienteService {
	
	public void salvar (Cliente cliente) throws ClassNotFoundException, SQLException{
		ClienteRepository repository = new ClienteRepository();
		repository.salvar(cliente);
	}
	
	public List<Cliente> listaDeClientes() throws SQLException, ClassNotFoundException{
		ClienteRepository repository = new ClienteRepository();
		return repository.listaDeClientes();
	}

}

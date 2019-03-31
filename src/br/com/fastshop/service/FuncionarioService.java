package br.com.fastshop.service;

import java.sql.SQLException;
import java.util.List;

import br.com.fastshop.model.Funcionario;
import br.com.fastshop.repository.FuncionarioRepository;

public class FuncionarioService {
	
	public void save (Funcionario funcionario) throws ClassNotFoundException, SQLException{
		FuncionarioRepository repositor = new FuncionarioRepository();
		repositor.save(funcionario);
	}
	
	public List<Funcionario> listaDeFuncionario() throws SQLException, ClassNotFoundException{
		FuncionarioRepository repositor = new FuncionarioRepository();
		return repositor.listaDeFuncionario();
	}

}

package br.com.fastshop.cotroller;

import java.sql.SQLException;
import java.util.List;


import br.com.fastshop.model.Funcionario;
import br.com.fastshop.service.FuncionarioService;

public class FuncionarioController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Funcionario funcionario = new Funcionario("moises","234523423");
		
		FuncionarioService service = new FuncionarioService();
		
		service.save(funcionario);
		
		List<Funcionario> listaDeFuncionario = service.listaDeFuncionario();
		for (Funcionario d : listaDeFuncionario) {
			System.out.println("Funcionario: "+d.getNome()+" Rg: "+ d.getRg());
		}
		

	}

}

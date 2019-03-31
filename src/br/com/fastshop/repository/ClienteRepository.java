package br.com.fastshop.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fastshop.acesso.AcessoMysql;
import br.com.fastshop.model.Cliente;

public class ClienteRepository {
	
	private AcessoMysql mysql = new AcessoMysql();
		
	public void salvar (Cliente cliente) throws ClassNotFoundException, SQLException{
		String insert = "INSERT INTO cliente (nome,cpf)  values(?,?)";
		PreparedStatement pstm;
	
		try {
			
			//abre a conexao com banco de dados
			pstm = mysql.connectar().prepareStatement(insert);

			//seta os paramentros nome e cpf
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			
			//fazer a atualizaçao no banco de dados
			pstm.executeUpdate();

			System.out.println("Cliente: "+ cliente.getNome()+ " salvo com sucesso");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {
          // mysql.desconectar();
		}
		
	}
	
	public List<Cliente> listaDeClientes() throws SQLException, ClassNotFoundException{
		Statement statement = null;
		ResultSet rs;
		String select = "SELECT * FROM cliente c";
		
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			
			//conectar com banco de dados
			statement = mysql.connectar().createStatement();

			// execute select no banco
			rs = statement.executeQuery(select);

			//varre as colunas do banco
			Cliente cliente;
			
			while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getString("id"));
                cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				clientes.add(cliente);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
          // mysql.desconectar();
		}
		
		 return clientes;
	}

}

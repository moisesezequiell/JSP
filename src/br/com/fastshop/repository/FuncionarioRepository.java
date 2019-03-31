package br.com.fastshop.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fastshop.acesso.AcessoMysql;
import br.com.fastshop.model.Funcionario;

public class FuncionarioRepository {

	private AcessoMysql mysql = new AcessoMysql();

	public void save(Funcionario funcionario) throws ClassNotFoundException, SQLException {
		String insert = "INSERT INTO funcionario (nome,rg)  values(?,?)";
		PreparedStatement pstm;

		try {
			pstm = mysql.connectar().prepareStatement(insert);
			pstm.setString(1, funcionario.getNome());
			pstm.setString(2, funcionario.getRg());

			pstm.executeUpdate();

			System.out.println("Funcionario: " + funcionario.getNome() + " salvo com sucesso");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {
			// mysql.desconectar();
		}

	}

	public List<Funcionario> listaDeFuncionario() throws SQLException, ClassNotFoundException {
		Statement statement = null;
		ResultSet rss;
		String select = "SELECT * FROM funcionario d";

		List<Funcionario> lista = new ArrayList<>();

		try {

			statement = mysql.connectar().createStatement();

			rss = statement.executeQuery(select);

			Funcionario funcionario;

			while (rss.next()) {
				funcionario = new Funcionario();
				funcionario.setId(rss.getString("id"));
				funcionario.setNome(rss.getString("nome"));
				funcionario.setRg(rss.getString("rg"));
				lista.add(funcionario);
			}

		} catch (SQLException r) {
			System.out.println(r.getMessage());
		} finally {
		}
		return lista;
	}

}

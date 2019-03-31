package br.com.fastshop.acesso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcessoMysql {

	private static Connection cnx = null;

	public Connection connectar() throws SQLException, ClassNotFoundException {
		if (cnx == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cnx = DriverManager.getConnection("jdbc:mysql://localhost/fastshop", "root", "root");
			
			} catch (SQLException ex) {
				throw new SQLException(ex);
			
			} catch (ClassNotFoundException ex) {
				throw new ClassCastException(ex.getMessage());
			}
		}
		return cnx;
	}

	public void desconectar() throws SQLException {
		if (cnx != null) {
			cnx.close();
		}
	}

}

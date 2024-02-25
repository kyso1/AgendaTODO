package Agenda.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class returnDB {

	private String databaseURL;
	private String user;
	private String password;
	private Connection con;
	ResultSet dados;
	ResultSet SalarioFull;
	
	public returnDB() throws ClassNotFoundException, SQLException {
		databaseURL = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgres";
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection(databaseURL, user, password);
		System.out.println("Conexão realizada com sucesso (returnDB).");
	}
	
	public void recuperar() throws SQLException {
		Statement stmt = con.createStatement();
		dados = stmt.executeQuery("SELECT valor FROM financeiro");
		Statement stmt2 = con.createStatement();
		SalarioFull = stmt2.executeQuery("SELECT valor FROM financeiro WHERE id = 1");
	}
	public float getResto() throws SQLException{
		if(SalarioFull != null) {
		float resto = SalarioFull.getFloat(2);
		float total = 0;
		while(dados.next()) {
			total += dados.getFloat(2);
		}
		total -= resto;
		return total;
	}
		return 0;
		}
	public float getMedia() throws SQLException{
		if(dados!= null) {
		float total = 0;
		while(dados.next()) {
			total += dados.getFloat(2);
		}
		float media = total/4;
		return media;
	}
		return 0;	
	}
}

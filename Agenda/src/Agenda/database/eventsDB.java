package Agenda.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class eventsDB {
	private String databaseURL;
	private String user;
	private String password;
	private Connection con;
	private ResultSet result;
	private String evento; 

	public eventsDB() throws ClassNotFoundException, SQLException {
		databaseURL = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgres";
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection(databaseURL, user, password);
		System.out.println("Conexão realizada com sucesso (saveDB).");
	}
	public void inserirEvento(int dia, int mes, int ano, String desc) throws SQLException, ClassNotFoundException {
		Statement stmt = con.createStatement();
		String sqlinsert = "INSERT into eventos (dia,mes,ano,desc) VALUES ("+dia+","+mes+","+ano+",'"+desc+"')";
		stmt.executeUpdate(sqlinsert);
	}
	public void limparEvento(int dia, int mes, int ano) throws SQLException, ClassNotFoundException {
		Statement stmt = con.createStatement();
		String sqlinsert = "DELETE FROM eventos WHERE (dia,mes,ano) = ("+dia+","+mes+","+ano+")";
		stmt.executeUpdate(sqlinsert);
	}
	public void setEvento() throws SQLException {
		Statement stmt = con.createStatement();
		result = stmt.executeQuery("SELECT * FROM eventos");
	}
	public String getEvento()throws SQLException{
		while(result.next()) {
			for(int i = 0; i<3;i++) {
				evento = result.getString(i).concat(evento);
			}
		}
		return evento;
	}
}

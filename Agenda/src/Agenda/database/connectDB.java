package Agenda.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	private String databaseURL;
	private String user;
	private String password;
	private Connection con;

	public connectDB() throws SQLException, ClassNotFoundException {
		databaseURL = "jdbc:postgresql://localhost:5432/aulaBD";
		user = "postgres";
		password = "postgres";
		Class.forName("org.postgresql.Driver");
		setCon(DriverManager.getConnection(databaseURL,user,password));
		System.out.println("Conexão realizada com sucesso.");
	}
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

}

package Agenda.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class saveDB {
	
	private String databaseURL;
	private String user;
	private String password;
	private int id;
	private float valor;
	private String nome;
	private Connection con;
	
	public saveDB() throws ClassNotFoundException, SQLException{
		databaseURL = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgres";
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection(databaseURL, user, password);
		System.out.println("Conexão realizada com sucesso (saveDB).");
	}
	public void inserir(int id, float valor, String nome) throws SQLException, ClassNotFoundException {
		Statement stmt = con.createStatement();
		String sqlinsert = "INSERT into financeiro (id,valor,nome) VALUES ("+id+","+valor+",'"+nome+"')";
		stmt.executeUpdate(sqlinsert);
	}
	public void deletar() throws SQLException, ClassNotFoundException{
		Statement stmt = con.createStatement();
		String delete = "DELETE FROM financeiro WHERE id ="+id;
		stmt.executeUpdate(delete);
	}
	public void update(int id, float valor) throws SQLException, ClassNotFoundException{
		Statement stmt = con.createStatement();
		String updt = "UPDATE financeiro SET  valor = "+valor+"  WHERE id = "+id;
		stmt.executeUpdate(updt);
	}
	
	//getter e setters
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDatabaseURL() {
		return databaseURL;
	}
	public void setDatabaseURL(String databaseURL) {
		this.databaseURL = databaseURL;
	}
}

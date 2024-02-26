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
		databaseURL = "jdbc:postgresql://localhost:5432/aulaBD";
		user = "postgres";
		password = "postgres";
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection(databaseURL, user, password);
		System.out.println("Conexão realizada com sucesso (eventsDB).");
	}
	public void inserirEvento(int dia, int mes, int ano, String desc) throws SQLException, ClassNotFoundException {
		Statement stmt = con.createStatement();
		String sqlinsert = "INSERT into eventos (dia,mes,ano,\"desc\") VALUES ("+dia+","+mes+","+ano+",'"+desc+"')"; //desc é uma palavra reservar do sql, por isso que ela está em aspas para não dar erro
		//String sqlinsert = "INSERT into eventos (dia,mes,ano,\"desc\") VALUES (01,01,2024,'oi')";
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
	public String getEvento(String comparar)throws SQLException{
		evento = "";
		//setEvento();
		//System.out.println("Comparar recebido: " + comparar);
		Statement stmt = con.createStatement();
		result = stmt.executeQuery("SELECT * FROM eventos");
		while(result.next()) {
			for(int i = 1; i<4;i++) {
				evento += result.getString(i);
				if(i != 3) {
					evento += "/"; //a variavel evento vai retornar a data pro extenso para fazer a comparação no CadastroEventoPanel, como a data compara possui "/", o método abaixo coloca ela a cada iteração, menos na ultima.
				}
			}
			//System.out.println("Evento data atual " + evento);
			if(evento.equals(comparar)) {
				//System.out.println("São iguais em!!! " + comparar + " " + evento);
				break;
			}else {
				evento = "";
			}
		}
		return evento;
	}
	
	public boolean getEventoTeste(String comparar)throws SQLException{
		Statement stmt = con.createStatement();
		String data[] = comparar.split("/");
		result = stmt.executeQuery("SELECT * FROM eventos WHERE dia = " + data[0] + " AND mes = " + data[1] + " AND ano = " + data[2]);
		if(result.next()) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getDesc(String datas) throws SQLException{
		String texto = "";
		Statement stmt = con.createStatement();
		String data[] = datas.split("/");
		result = stmt.executeQuery("SELECT * FROM eventos WHERE dia = " + data[0] + " AND mes = " + data[1] + " AND ano = " + data[2]);
		if(result.next()) {
			texto = result.getString("desc");
		}
		
		return texto;
	}
}

package financeiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
    private String databaseURL;
	private String user;
	private String password;
	private Connection con;

    public ConnectDB() throws SQLException, ClassNotFoundException {

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

    public void inserir(float salario, float luz, float agua, float any, float aluguel) throws SQLException {	
		String sqlinsert = "INSERT INTO dadosFinanceiros VALUES ('"+salario+"','"+luz+"'','"+agua+"','"+aluguel+"','"+any+"')";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sqlinsert);
	}
}

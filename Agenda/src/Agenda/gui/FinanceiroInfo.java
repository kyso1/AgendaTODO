package Agenda.gui;

import javax.swing.JPanel;

import Agenda.database.returnDB;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;

public class FinanceiroInfo extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public FinanceiroInfo() throws ClassNotFoundException, SQLException {
		setLayout(null);
		
		JLabel lblSalarioRestante = new JLabel("Salário restante");
		lblSalarioRestante.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSalarioRestante.setBounds(10, 10, 135, 13);
		add(lblSalarioRestante);
		
		JLabel lblMediaSalario = new JLabel("Média Salarial");
		lblMediaSalario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMediaSalario.setBounds(10, 33, 135, 13);
		add(lblMediaSalario);
		
		JLabel lblNewLabel = new JLabel("R$");
		lblNewLabel.setBounds(257, 8, 21, 20);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$");
		lblNewLabel_1.setBounds(257, 26, 21, 20);
		add(lblNewLabel_1);
		
		returnDB returnDB = new returnDB();
		String restante = String.valueOf(returnDB.getResto());
		if(restante=="0"){
			JLabel lblRestante = new JLabel("0,00");
			lblRestante.setBounds(276, 11, 46, 14);
			add(lblRestante);
		}else {
		JLabel lblRestante = new JLabel(restante);
		lblRestante.setBounds(276, 11, 46, 14);
		add(lblRestante);
	}
		String media = String.valueOf(returnDB.getMedia());
		if(media == "0") {
			JLabel lblmediaSal = new JLabel("0,00");
			lblmediaSal.setBounds(275, 29, 46, 14);
			add(lblmediaSal);
		}else {
			JLabel lblmediaSal = new JLabel(media);
			lblmediaSal.setBounds(275, 29, 46, 14);
			add(lblmediaSal);
		}
	}
}

package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class FinanceiroInfo extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public FinanceiroInfo() {
		setLayout(null);
		
		JLabel lblSalarioRestante = new JLabel("Salário restante");
		lblSalarioRestante.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSalarioRestante.setBounds(10, 10, 135, 13);
		add(lblSalarioRestante);
		
		JLabel lblMediaSalario = new JLabel("Média Salarial");
		lblMediaSalario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMediaSalario.setBounds(10, 33, 135, 13);
		add(lblMediaSalario);

	}

}

package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class FinanceiroPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfSalario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public FinanceiroPanel() {
		setLayout(null);
		
		JLabel lblSalario = new JLabel("Salário");
		lblSalario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSalario.setBounds(10, 10, 96, 17);
		add(lblSalario);
		
		tfSalario = new JTextField();
		tfSalario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfSalario.setBounds(265, 8, 96, 19);
		add(tfSalario);
		tfSalario.setColumns(10);
		
		JLabel lblContaLuz = new JLabel("Valor da conta de Luz");
		lblContaLuz.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContaLuz.setBounds(10, 37, 186, 19);
		add(lblContaLuz);
		
		textField = new JTextField();
		textField.setBounds(265, 37, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblContaAgua = new JLabel("Valor da conta de Água");
		lblContaAgua.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContaAgua.setBounds(10, 66, 199, 18);
		add(lblContaAgua);
		
		textField_1 = new JTextField();
		textField_1.setBounds(265, 65, 96, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContaAluguel = new JLabel("Valor do Aluguel");
		lblContaAluguel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContaAluguel.setBounds(10, 93, 174, 18);
		add(lblContaAluguel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(265, 92, 96, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRs = new JLabel("R$");
		lblRs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRs.setBounds(241, 12, 24, 13);
		add(lblRs);
		
		JLabel lblRs_1 = new JLabel("R$");
		lblRs_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRs_1.setBounds(241, 39, 24, 13);
		add(lblRs_1);
		
		JLabel lblRs_2 = new JLabel("R$");
		lblRs_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRs_2.setBounds(241, 67, 24, 13);
		add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("R$");
		lblRs_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRs_3.setBounds(241, 95, 24, 13);
		add(lblRs_3);

	}
}

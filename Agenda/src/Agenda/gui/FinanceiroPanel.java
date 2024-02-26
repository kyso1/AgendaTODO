package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import Agenda.database.saveDB;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
public class FinanceiroPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfSalario;
	private JTextField tfLuz;
	private JTextField tfAgua;
	private JTextField tfAluguel;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public FinanceiroPanel() throws ClassNotFoundException, SQLException {
		setLayout(null);
		
		saveDB saveDB = new saveDB();
		
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
		
		tfLuz = new JTextField();
		tfLuz.setBounds(265, 37, 96, 19);
		add(tfLuz);
		tfLuz.setColumns(10);
		
		JLabel lblContaAgua = new JLabel("Valor da conta de Água");
		lblContaAgua.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContaAgua.setBounds(10, 66, 199, 18);
		add(lblContaAgua);
		
		tfAgua = new JTextField();
		tfAgua.setBounds(265, 65, 96, 19);
		add(tfAgua);
		tfAgua.setColumns(10);
		
		JLabel lblContaAluguel = new JLabel("Valor do Aluguel");
		lblContaAluguel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContaAluguel.setBounds(10, 91, 174, 18);
		add(lblContaAluguel);
		
		tfAluguel = new JTextField();
		tfAluguel.setBounds(265, 92, 96, 19);
		add(tfAluguel);
		tfAluguel.setColumns(10);
		
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
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(328, 251, 89, 23);
		add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idSal = 1;
				float valueSal = Float.parseFloat(tfSalario.getText());
				String sal = "Salário";
				try {
					saveDB.inserir(idSal, valueSal, sal);
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int idLuz = 2;
				float valueLuz = Float.parseFloat(tfLuz.getText());
				String luz = "Conta Luz";
				try {
					saveDB.inserir(idLuz, valueLuz, luz);
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				int idAgua = 3;
				float valueAgua = Float.parseFloat(tfAgua.getText());
				String agua = "Conta Água";
				try {
					saveDB.inserir(idAgua, valueAgua, agua);
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				int idAluguel = 4;
				float valueAluguel = Float.parseFloat(tfAluguel.getText());
				String aluguel = "Aluguel";
				try {
					saveDB.inserir(idAluguel, valueAluguel, aluguel);
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		final JButton btnAtt = new JButton("Atualizar");;
		btnAtt.setBounds(227, 251, 89, 23);
		add(btnAtt);
		btnAtt.setEnabled(false);
		
		JComboBox<String> comboBoxDeletar = new JComboBox<String>();
		comboBoxDeletar.setBounds(15, 147, 142, 22);
		add(comboBoxDeletar);
		comboBoxDeletar.addItem("Salário");
		comboBoxDeletar.addItem("Conta Água");
		comboBoxDeletar.addItem("Conta Luz");
		comboBoxDeletar.addItem("Aluguel");
		
		JLabel lblDeleteRequest = new JLabel("Escolha alguma conta para apagar:");
		lblDeleteRequest.setBounds(10, 130, 199, 14);
		add(lblDeleteRequest);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(167, 147, 89, 23);
		add(btnDeletar);
		
		JRadioButton rdbtnSal = new JRadioButton("Atualizar");
		rdbtnSal.setBounds(367, 7, 109, 23);
		add(rdbtnSal);
		rdbtnSal.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(rdbtnSal.isSelected()) {
					btnAtt.setEnabled(true);
					}else {
						btnAtt.setEnabled(false);
					}
				}
		});
		
		JRadioButton rdbtnLuz = new JRadioButton("Atualizar");
		rdbtnLuz.setBounds(367, 37, 109, 23);
		add(rdbtnLuz);
		rdbtnLuz.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(rdbtnLuz.isSelected()) {
					btnAtt.setEnabled(true);
					}else {
						btnAtt.setEnabled(false);
					}
				}
		});
		
		JRadioButton rdbtnAgua = new JRadioButton("Atualizar");
		rdbtnAgua.setBounds(367, 66, 109, 23);
		add(rdbtnAgua);
		rdbtnAgua.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(rdbtnAgua.isSelected()) {
					btnAtt.setEnabled(true);
					}else {
						btnAtt.setEnabled(false);
					}
				}
		});
		
		JRadioButton rdbtnAluguel = new JRadioButton("Atualizar");
		rdbtnAluguel.setBounds(367, 91, 109, 23);
		add(rdbtnAluguel);
		rdbtnAluguel.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(rdbtnAluguel.isSelected()) {
					btnAtt.setEnabled(true);
					}else {
						btnAtt.setEnabled(false);
					}
				}
		});
		
		
		/*if(rdbtnSal.isSelected() || rdbtnLuz.isSelected() || rdbtnAgua.isSelected() || rdbtnAluguel.isSelected()) {
			btnAtt.setEnabled(false);
			if(rdbtnSal.isSelected()) {
				saveDB.update(1,Float.parseFloat(tfSalario.getText()));
			}else if(rdbtnLuz.isSelected()) {
				saveDB.update(2,Float.parseFloat(tfLuz.getText()));
			}else if(rdbtnAgua.isSelected()){
				saveDB.update(3,Float.parseFloat(tfAgua.getText()));
			}else if(rdbtnAluguel.isSelected()) {
				saveDB.update(4,Float.parseFloat(tfAluguel.getText()));
			}
		}*/
		
		btnAtt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSal.isSelected() || rdbtnLuz.isSelected() || rdbtnAgua.isSelected() || rdbtnAluguel.isSelected()) {
					btnAtt.setEnabled(false);
					if(rdbtnSal.isSelected()) {
						try {
							saveDB.update(1,Float.parseFloat(tfSalario.getText()));
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(rdbtnLuz.isSelected()) {
						try {
							saveDB.update(2,Float.parseFloat(tfLuz.getText()));
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(rdbtnAgua.isSelected()){
						try {
							saveDB.update(3,Float.parseFloat(tfAgua.getText()));
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(rdbtnAluguel.isSelected()) {
						try {
							saveDB.update(4,Float.parseFloat(tfAluguel.getText()));
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
			
		});
		
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String conta = (String) comboBoxDeletar.getSelectedItem();
				if (conta == "Salário") {
					saveDB.setID(1);
					try {
						saveDB.deletar();
					} catch (SQLException | ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				}else  if(conta=="Conta Água") {
					saveDB.setID(2);
					try {
						saveDB.deletar();
					} catch (SQLException| ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				}else if(conta == "Conta Luz") {
					saveDB.setID(3);
					try {
						saveDB.deletar();
					} catch (SQLException | ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				}else if(conta == "Aluguel") {
					saveDB.setID(4);
					try {
						saveDB.deletar();
					} catch (SQLException | ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
				);
	}
}

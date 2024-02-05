package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Point;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CadastroEventoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfDescEvento;
	private JTextField tfDataEvento;
	private JTextField tfEncaminharEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public CadastroEventoPanel() {
		setLayout(null);
		
		tfDescEvento = new JTextField();
		tfDescEvento.setSize(403, 20);
		tfDescEvento.setLocation(new Point(10, 36));
		add(tfDescEvento);
		tfDescEvento.setColumns(10);
		
		JLabel lblDescEvento = new JLabel("Descrição do Evento");
		lblDescEvento.setBounds(10, 11, 114, 14);
		lblDescEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblDescEvento);
		
		JLabel lblDataEvento = new JLabel("Data do Evento");
		lblDataEvento.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDataEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataEvento.setBounds(10, 67, 114, 14);
		add(lblDataEvento);
		
		tfDataEvento = new JTextField();
		tfDataEvento.setBounds(134, 61, 120, 20);
		add(tfDataEvento);
		tfDataEvento.setColumns(10);
		
		JLabel lblEncaminharEmail = new JLabel("Encaminhar E-mail");
		lblEncaminharEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEncaminharEmail.setBounds(10, 92, 114, 14);
		add(lblEncaminharEmail);
		
		tfEncaminharEmail = new JTextField();
		tfEncaminharEmail.setBounds(134, 89, 200, 20);
		add(tfEncaminharEmail);
		tfEncaminharEmail.setColumns(10);
		
		JRadioButton rdbUmavez = new JRadioButton("Uma vez");
		buttonGroup.add(rdbUmavez);
		rdbUmavez.setBounds(158, 116, 67, 23);
		add(rdbUmavez);
		
		JLabel lblPeriodicidadeEvento = new JLabel("Periodicidade do Evento");
		lblPeriodicidadeEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeriodicidadeEvento.setBounds(10, 120, 142, 14);
		add(lblPeriodicidadeEvento);
		
		JRadioButton rdbSemanal = new JRadioButton("Semanal");
		buttonGroup.add(rdbSemanal);
		rdbSemanal.setBounds(227, 116, 67, 23);
		add(rdbSemanal);
		
		JRadioButton rdbMensal = new JRadioButton("Mensal");
		buttonGroup.add(rdbMensal);
		rdbMensal.setBounds(296, 116, 67, 23);
		add(rdbMensal);
		
		JCheckBox ckbAlarme = new JCheckBox("Alarme");
		ckbAlarme.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckbAlarme.setBounds(10, 141, 97, 23);
		add(ckbAlarme);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(134, 141, 89, 23);
		add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(245, 141, 89, 23);
		add(btnLimpar);

	}
}

package Agenda.gui;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Agenda.database.eventsDB;

public class CadastroEventoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfDescEvento;
	private JTextField tfDataEvento;
	private JTextField tfEncaminharEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public CadastroEventoPanel() throws ClassNotFoundException, SQLException {
		setLayout(null);

		tfDescEvento = new JTextField();
		tfDescEvento.setSize(403, 124);
		tfDescEvento.setLocation(new Point(10, 36));
		add(tfDescEvento);
		tfDescEvento.setColumns(10);

		JLabel lblDescEvento = new JLabel("Descrição do Evento:");
		lblDescEvento.setBounds(10, 11, 114, 14);
		lblDescEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblDescEvento);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(226, 266, 89, 23);
		add(btnSalvar);
		btnSalvar.setEnabled(false);

		JLabel lblDataEvento = new JLabel("Data do Evento:");
		lblDataEvento.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDataEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataEvento.setBounds(10, 171, 114, 14);
		add(lblDataEvento);

		tfDataEvento = new JTextField();
		tfDataEvento.setBounds(104, 168, 120, 20);
		add(tfDataEvento);
		tfDataEvento.setColumns(10);
		
		//arrumar essa porra que ta dando erro de conversão por algum motivo
		

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(324, 266, 89, 23);
		add(btnLimpar);
		btnLimpar.setEnabled(false);

		tfDataEvento.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!tfDataEvento.getText().equals("")) {
					btnSalvar.setEnabled(true);
					/*String[] dataRaw = tfDataEvento.getText().split("/");
					
					int[] dataFormatada = new int[3];
					for(int i= 0; i<3;i++) {
						dataFormatada[i] = Integer.parseInt(dataRaw[i]);
					}
					int data[] = new int[3];
					for(int i=0;i<3;i++) {
						data[i] =dataFormatada[i];
					}

					eventsDB eventsDB = null;
					try {
						eventsDB = new eventsDB();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						eventsDB.inserirEvento(data[0],data[1],data[2],tfDescEvento.getText());
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						if(eventsDB.getEvento() != tfDataEvento.getText()) {
							btnLimpar.setEnabled(true);
							JLabel lblDiaCheio = new JLabel("Você já possui evento neste dia!");
							lblDiaCheio.setBounds(104, 196, 188, 14);
							add(lblDiaCheio);
						}else {
							JLabel lblDiaCheio = new JLabel("Você não possui evento neste dia!");
							lblDiaCheio.setBounds(104, 196, 188, 14);
							add(lblDiaCheio);
						}
					}catch(Exception e1) {
						System.out.println("Erro: " + e1 );
					}*/
				}else {
					btnSalvar.setEnabled(false);
				}
		
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] dataRaw = tfDataEvento.getText().split("/");
				for(int i = 0; i < 3; i++) {
					System.out.println(dataRaw[i]);
				}
				
				
				int[] dataFormatada = new int[3];
				for(int i= 0; i<3;i++) {
					dataFormatada[i] = Integer.parseInt(dataRaw[i]);
				}
				int data[] = new int[3];
				for(int i=0;i<3;i++) {
					data[i] =dataFormatada[i];
				}
				
				eventsDB eventsDB;
				try {
					eventsDB = new eventsDB();
					//System.out.println(eventsDB.getEvento(tfDataEvento.getText()) + "\n");
					//System.out.println(tfDescEvento.getText() + "\n");
					//eventsDB.inserirEvento(data[0],data[1],data[2],tfDescEvento.getText());
					if(eventsDB.getEvento(tfDataEvento.getText()) == null) {
						System.out.println("Evento cadastrado");
						JLabel lblDiaCheio = new JLabel("Você não possui evento neste dia!");
						lblDiaCheio.setBounds(104, 196, 188, 14);
						add(lblDiaCheio);
						eventsDB.inserirEvento(data[0],data[1],data[2],tfDescEvento.getText());
						JLabel lblSucesso = new JLabel("Evento cadastrado com sucesso!");
						lblSucesso.setBounds(104, 206, 188, 14);
						add(lblSucesso);
					}else {
						if(eventsDB.getEvento(tfDataEvento.getText()).equals(tfDataEvento.getText())) {
							btnLimpar.setEnabled(true);
							JLabel lblDiaCheio = new JLabel("Você já possui evento neste dia!");
							lblDiaCheio.setBounds(104, 196, 188, 14);
							add(lblDiaCheio);
							System.out.println("Evento existente");
						}else {
							JLabel lblDiaCheio = new JLabel("Você não possui evento neste dia!");
							lblDiaCheio.setBounds(104, 196, 188, 14);
							add(lblDiaCheio);
							eventsDB.inserirEvento(data[0],data[1],data[2],tfDescEvento.getText());
							JLabel lblSucesso = new JLabel("Evento cadastrado com sucesso!");
							lblSucesso.setBounds(104, 206, 188, 14);
							add(lblSucesso);
							System.out.println("Evento cadastrado sucesso");
						}
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
								
			}
			
		});

		JLabel ajuda = new JLabel("Exemplo: 1/1/2001");
		ajuda.setBounds(234, 171, 131, 14);
		add(ajuda);
	
	}
}

package Agenda.gui;

import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;

public class AgendaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaFrame frame = new AgendaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AgendaFrame() throws ClassNotFoundException, SQLException {
		setTitle("Agenda");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 396);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 11, 565, 335);
		CadastroEventoPanel cadastroEventoPanel = new CadastroEventoPanel();
		FinanceiroPanel financeiroPanel = new FinanceiroPanel();
		FinanceiroInfo financeiroInfo = new FinanceiroInfo();
		
		Calendario calendario = new Calendario();
		tabbedPane.addTab("Calendário", null, calendario, null);
		tabbedPane.addTab("Cadastro de Eventos", cadastroEventoPanel);
		tabbedPane.addTab("Cadastro Financeiro", financeiroPanel);
		tabbedPane.addTab("Informações Financeiro", financeiroInfo);
		contentPane.add(tabbedPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListaEventosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaEventosPanel() {
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 452, 271);
		add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

	}

}

package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Calendario extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Calendario() {
		
		JLabel lblNewLabel = new JLabel("PINTO CU BOSTA MIJO MIJO MIJO CU BOSTA");
		lblNewLabel.setBounds(104, 36, 221, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(slide_);
		
		Slide slide_ = new Slide();
		slide_.setBounds(10, 84, 430, 205);
		slide_.setLayout(null);
		setLayout(null);
		add(lblNewLabel);
		add(slide_);
		
		slide_.show(new TesteGridLayoutGui(2, 2024), Slide.AnimateType.TO_RIGHT);
		
	}
}

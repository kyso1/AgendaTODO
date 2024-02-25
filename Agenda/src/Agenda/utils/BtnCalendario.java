package Agenda.utils;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class BtnCalendario extends JButton{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Date data;
	private boolean titulo;
	
	public BtnCalendario() {
		setContentAreaFilled(false);
		setBorder(null);
		setHorizontalAlignment(JLabel.CENTER );
		addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("oi " + data); 
			}
			
		});
	}
	
	public void iniTitulo() {
		titulo = true;
	}
	
	public boolean getTitulo() {
		return titulo;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public void mesAtual(boolean act) {
		if(act) {
			setForeground(new Color(68, 68, 68));
		}else {
			setForeground(new Color(169, 169, 169));
		}
	}
	
}

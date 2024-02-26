package Agenda.utils;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import Agenda.gui.Calendario;
import Agenda.gui.MostrarEvento;
import Agenda.database.*;

public class BtnCalendario extends JButton{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Date data;
	private boolean titulo;
	private String data_extenso;
	
	public BtnCalendario() {
		setContentAreaFilled(false);
		setBorder(null);
		setHorizontalAlignment(JLabel.CENTER );
		addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("oi " + data);
				System.out.println(data_extenso);
				
				MostrarEvento evento_mostrar = new MostrarEvento();
				eventsDB evento;
				try {
					evento = new eventsDB();
					evento_mostrar.setTexto(evento.getDesc(data_extenso));
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				evento_mostrar.setVisible(true);
				
			}
			
		});
	}
	
	public String getDataExtenso() {
		return this.data_extenso;
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
	
	public void setDataExtenso(String data_extenso) {
		this.data_extenso = data_extenso;
	}
	
	public void mesAtual(boolean act) {
		if(act) {
			setForeground(new Color(68, 68, 68));
		}else {
			setForeground(new Color(169, 169, 169));
		}
	}
	
}

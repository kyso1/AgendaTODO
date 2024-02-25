package Agenda.gui;

import javax.swing.JPanel;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calendario extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	private Calendar cal = Calendar.getInstance();
	private int mes;
	private int ano;
	public JLabel lblMesAno = new JLabel("Mes - Ano");
	public Slide slide = new Slide();
	
	public Calendario() {
		setMesAnoAtual();
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, slide, 6, SpringLayout.SOUTH, lblMesAno);
		springLayout.putConstraint(SpringLayout.WEST, slide, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, slide, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, slide, -10, SpringLayout.EAST, this);
		setLayout(springLayout);
		
		//JLabel lblMesAno = new JLabel("Mes - Ano");
		lblMesAno.setFont(new Font("Tahoma", Font.BOLD, 17));
		springLayout.putConstraint(SpringLayout.NORTH, lblMesAno, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblMesAno, 140, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblMesAno, 33, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblMesAno, -138, SpringLayout.EAST, this);
		lblMesAno.setHorizontalAlignment(SwingConstants.CENTER);
		//SimpleDateFormat df = new SimpleDateFormat("MMMM-yyyy");
		//lblMesAno.setText(df.format(cal.getTime()));
		mostrarMesAnoAtual();
		add(lblMesAno);
		
		JButton btnProximo = new JButton("Próximo");
		springLayout.putConstraint(SpringLayout.NORTH, btnProximo, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnProximo, -6, SpringLayout.NORTH, slide);
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mes == 11) {
					mes = 0;
					ano++;
				}else {
					mes++;
				}
				slide.show(new TesteGridLayoutGui(mes, ano), Slide.AnimateType.TO_LEFT);
				mostrarMesAnoAtual();
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnProximo, 6, SpringLayout.EAST, lblMesAno);
		add(btnProximo);
		
		JButton btnAnterior = new JButton("Anterior");
		springLayout.putConstraint(SpringLayout.NORTH, btnAnterior, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnterior, -6, SpringLayout.NORTH, slide);
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mes == 0) {
					mes = 11;
					ano--;
				}else {
					mes--;
				}
				slide.show(new TesteGridLayoutGui(mes, ano), Slide.AnimateType.TO_RIGHT);
				mostrarMesAnoAtual();
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, btnAnterior, -6, SpringLayout.WEST, lblMesAno);
		add(btnAnterior);
		slide.show(new TesteGridLayoutGui(mes, ano), Slide.AnimateType.TO_RIGHT);
		add(slide);
		
		
	}
	
	private void setMesAnoAtual() {
		cal.setTime(new Date());
		this.mes = cal.get(Calendar.MONTH);
		this.ano = cal.get(Calendar.YEAR);
	}
	
	private void mostrarMesAnoAtual() {
		cal.set(Calendar.MONTH, mes);
		cal.set(Calendar.YEAR, ano);
		cal.set(Calendar.DATE, 1);
		SimpleDateFormat df = new SimpleDateFormat("MMMM - yyyy");
		lblMesAno.setText(df.format(cal.getTime()));
	}
}

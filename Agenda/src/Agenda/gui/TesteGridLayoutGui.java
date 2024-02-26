package Agenda.gui;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import Agenda.utils.BtnCalendario;
import java.awt.Color;
import java.awt.Component;

public class TesteGridLayoutGui extends JLayeredPane {

	private static final long serialVersionUID = 1L;

	private int mes;
	private int ano;
	public String teste = "testando";
	
	public TesteGridLayoutGui(int mes, int ano) {
		setLayout(new GridLayout(7, 7, 0, 0));
		
		BtnCalendario btnCalDom = new BtnCalendario();
		btnCalDom.setForeground(new Color(255, 0, 0));
		btnCalDom.setText("DOM");
		add(btnCalDom);
		
		BtnCalendario btnCalSeg = new BtnCalendario();
		btnCalSeg.setText("SEG");
		add(btnCalSeg);
		
		BtnCalendario btnCalTer = new BtnCalendario();
		btnCalTer.setText("TER");
		add(btnCalTer);
		
		BtnCalendario btnCalQua = new BtnCalendario();
		btnCalQua.setText("QUA");
		add(btnCalQua);
		
		BtnCalendario btnCalQui = new BtnCalendario();
		btnCalQui.setText("QUI");
		add(btnCalQui);
		
		BtnCalendario btnCalSex = new BtnCalendario();
		btnCalSex.setText("SEX");
		add(btnCalSex);
		
		BtnCalendario btnCalSab = new BtnCalendario();
		btnCalSab.setText("SAB");
		add(btnCalSab);
		
		BtnCalendario btnclndrCedula_17 = new BtnCalendario();
		btnclndrCedula_17.setText("");
		add(btnclndrCedula_17);
		
		BtnCalendario btnclndrCedula_16 = new BtnCalendario();
		btnclndrCedula_16.setText("");
		add(btnclndrCedula_16);
		
		BtnCalendario btnclndrCedula_15 = new BtnCalendario();
		btnclndrCedula_15.setText("");
		add(btnclndrCedula_15);
		
		BtnCalendario btnclndrCedula_12 = new BtnCalendario();
		btnclndrCedula_12.setText("");
		add(btnclndrCedula_12);
		
		BtnCalendario btnclndrCedula_11 = new BtnCalendario();
		btnclndrCedula_11.setText("");
		add(btnclndrCedula_11);
		
		BtnCalendario btnclndrCedula_10 = new BtnCalendario();
		btnclndrCedula_10.setText("");
		add(btnclndrCedula_10);
		
		BtnCalendario btnclndrCedula_9 = new BtnCalendario();
		btnclndrCedula_9.setText("");
		add(btnclndrCedula_9);
		
		BtnCalendario btnclndrCedula_8 = new BtnCalendario();
		btnclndrCedula_8.setText("");
		add(btnclndrCedula_8);
		
		BtnCalendario btnclndrCedula_4 = new BtnCalendario();
		btnclndrCedula_4.setText("");
		add(btnclndrCedula_4);
		
		BtnCalendario btnclndrCedula_5 = new BtnCalendario();
		btnclndrCedula_5.setText("");
		add(btnclndrCedula_5);
		
		BtnCalendario btnclndrCedula_6 = new BtnCalendario();
		btnclndrCedula_6.setText("");
		add(btnclndrCedula_6);
		
		BtnCalendario btnclndrCedula = new BtnCalendario();
		btnclndrCedula.setText("");
		add(btnclndrCedula);
		
		BtnCalendario btnclndrCedula_19 = new BtnCalendario();
		btnclndrCedula_19.setText("");
		add(btnclndrCedula_19);
		
		BtnCalendario btnclndrCedula_21 = new BtnCalendario();
		btnclndrCedula_21.setText("");
		add(btnclndrCedula_21);
		
		BtnCalendario btnclndrCedula_20 = new BtnCalendario();
		btnclndrCedula_20.setText("");
		add(btnclndrCedula_20);
		
		BtnCalendario btnclndrCedula_22 = new BtnCalendario();
		btnclndrCedula_22.setText("");
		add(btnclndrCedula_22);
		
		BtnCalendario btnclndrCedula_24 = new BtnCalendario();
		btnclndrCedula_24.setText("");
		add(btnclndrCedula_24);
		
		BtnCalendario btnclndrCedula_23 = new BtnCalendario();
		btnclndrCedula_23.setText("");
		add(btnclndrCedula_23);
		
		BtnCalendario btnclndrCedula_25 = new BtnCalendario();
		btnclndrCedula_25.setText("");
		add(btnclndrCedula_25);
		
		BtnCalendario btnclndrCedula_26 = new BtnCalendario();
		btnclndrCedula_26.setText("");
		add(btnclndrCedula_26);
		
		BtnCalendario btnclndrCedula_28 = new BtnCalendario();
		btnclndrCedula_28.setText("");
		add(btnclndrCedula_28);
		
		BtnCalendario btnclndrCedula_27 = new BtnCalendario();
		btnclndrCedula_27.setText("");
		add(btnclndrCedula_27);
		
		BtnCalendario btnclndrCedula_30 = new BtnCalendario();
		btnclndrCedula_30.setText("");
		add(btnclndrCedula_30);
		
		BtnCalendario btnclndrCedula_29 = new BtnCalendario();
		btnclndrCedula_29.setText("");
		add(btnclndrCedula_29);
		
		BtnCalendario btnclndrCedula_31 = new BtnCalendario();
		btnclndrCedula_31.setText("");
		add(btnclndrCedula_31);
		
		BtnCalendario btnclndrCedula_32 = new BtnCalendario();
		btnclndrCedula_32.setText("");
		add(btnclndrCedula_32);
		
		BtnCalendario btnclndrCedula_33 = new BtnCalendario();
		btnclndrCedula_33.setText("");
		add(btnclndrCedula_33);
		
		BtnCalendario btnclndrCedula_36 = new BtnCalendario();
		btnclndrCedula_36.setText("");
		add(btnclndrCedula_36);
		
		BtnCalendario btnclndrCedula_34 = new BtnCalendario();
		btnclndrCedula_34.setText("");
		add(btnclndrCedula_34);
		
		BtnCalendario btnclndrCedula_35 = new BtnCalendario();
		btnclndrCedula_35.setText("");
		add(btnclndrCedula_35);
		
		BtnCalendario btnclndrCedula_37 = new BtnCalendario();
		btnclndrCedula_37.setText("");
		add(btnclndrCedula_37);
		
		BtnCalendario btnclndrCedula_38 = new BtnCalendario();
		btnclndrCedula_38.setText("");
		add(btnclndrCedula_38);
		
		BtnCalendario btnclndrCedula_39 = new BtnCalendario();
		btnclndrCedula_39.setText("");
		add(btnclndrCedula_39);
		
		BtnCalendario btnclndrCedula_40 = new BtnCalendario();
		btnclndrCedula_40.setText("");
		add(btnclndrCedula_40);
		
		BtnCalendario btnclndrCedula_41 = new BtnCalendario();
		btnclndrCedula_41.setText("");
		add(btnclndrCedula_41);
		
		BtnCalendario btnclndrCedula_42 = new BtnCalendario();
		btnclndrCedula_42.setText("");
		add(btnclndrCedula_42);
		
		BtnCalendario btnclndrCedula_43 = new BtnCalendario();
		btnclndrCedula_43.setText("");
		add(btnclndrCedula_43);
		
		BtnCalendario btnclndrCedula_44 = new BtnCalendario();
		btnclndrCedula_44.setText("");
		add(btnclndrCedula_44);
		
		BtnCalendario btnclndrCedula_45 = new BtnCalendario();
		btnclndrCedula_45.setText("");
		add(btnclndrCedula_45);
		
		BtnCalendario btnclndrCedula_46 = new BtnCalendario();
		btnclndrCedula_46.setText("");
		add(btnclndrCedula_46);
		
		BtnCalendario btnclndrCedula_47 = new BtnCalendario();
		btnclndrCedula_47.setText("");
		add(btnclndrCedula_47);
		
		BtnCalendario btnclndrCedula_48 = new BtnCalendario();
		btnclndrCedula_48.setText("");
		btnclndrCedula_48.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(btnclndrCedula_48.getDataExtenso());
			}
			
		});
		add(btnclndrCedula_48);

		this.mes = mes;
		this.ano = ano;
		System.out.println("mes: " + mes + " ano: " + ano);
		
		btnCalSeg.iniTitulo();
		btnCalTer.iniTitulo();
		btnCalQua.iniTitulo();
		btnCalQui.iniTitulo();
		btnCalSex.iniTitulo();
		btnCalSab.iniTitulo();
		btnCalDom.iniTitulo();
		setData();
		
	}
	
	//função para fazer os botões do calendario ter os numeros dos dias
	private void setData() {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, ano);
		System.out.println("Ano recebido: " + ano + "  ano no CALENDAR " + calendario.get(Calendar.YEAR));
		calendario.set(Calendar.MONTH, mes); //mes de janeiro considerado como 0
		System.out.println("Mes recebedo: " + mes + "  mes no CALENDAR " + calendario.get(Calendar.MONTH));
		calendario.set(Calendar.DATE, 1);
		System.out.println(calendario.get(Calendar.DATE));
		int iniciarDia = calendario.get(Calendar.DAY_OF_WEEK)- 1;
		calendario.add(Calendar.DATE, -iniciarDia);
		for(Component com : getComponents()) {
			BtnCalendario btn = (BtnCalendario) com;
			if(!btn.getTitulo()) {
				btn.setText(calendario.get(Calendar.DATE) + "");
				btn.setData(calendario.getTime());
				//System.out.println("" + calendario.get(Calendar.DATE) + "/" + (calendario.get(Calendar.MONTH) + 1) + "/" + calendario.get(Calendar.YEAR));
				btn.setDataExtenso("" + calendario.get(Calendar.DATE) + "/" + (calendario.get(Calendar.MONTH) + 1) + "/" + calendario.get(Calendar.YEAR));
				btn.mesAtual(calendario.get(Calendar.MONTH) == mes);
				calendario.add(Calendar.DATE, 1); //acrescenta um dia
			}
		}
	}

}

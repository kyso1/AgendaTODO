package Agenda.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import Agenda.utils.PeriodicidadeEnum;

public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date dataEvento;

	private String descEvento;
	private PeriodicidadeEnum periodicidade;
	private String emailEncaminhar;
	private int alarme;

	public Evento() {
		super();
	}

	public Evento(Date dataEvento, String descEvento, PeriodicidadeEnum periodicidade, String emailEncaminhar,
			int alarme) {
		super();
		this.dataEvento = dataEvento;
		this.descEvento = descEvento;
		this.periodicidade = periodicidade;
		this.emailEncaminhar = emailEncaminhar;
		this.alarme = alarme;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescEvento() {
		return descEvento;
	}

	public void setDescEvento(String descEvento) {
		this.descEvento = descEvento;
	}

	public PeriodicidadeEnum getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getEmailEncaminhar() {
		return emailEncaminhar;
	}

	public void setEmailEncaminhar(String emailEncaminhar) {
		this.emailEncaminhar = emailEncaminhar;
	}

	public int getAlarme() {
		return alarme;
	}

	public void setAlarme(int alarme) {
		this.alarme = alarme;
	}

	public String toString() {
		SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy");
		return (mascaraData.format(getDataEvento()) + ";" + getDescEvento() + ";" + getPeriodicidade() + ";"
				+ getEmailEncaminhar() + ";" + getAlarme());
	}
}
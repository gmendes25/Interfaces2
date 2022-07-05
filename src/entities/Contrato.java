package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date date;
	private Double value;

	List<Parcelamento> parcelamento = new ArrayList<>();

	public Contrato(Integer numero, Date date, Double value) {
		this.numero = numero;
		this.date = date;
		this.value = value;
	}

	public void addParc(Parcelamento parc) {
		parcelamento.add(parc);
	}

	public void removeParc(Parcelamento parc) {
		parcelamento.remove(parc);
	}

	public List<Parcelamento> getParcelamento() {
		return parcelamento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}

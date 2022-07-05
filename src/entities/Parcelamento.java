package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

	private Date dataDeVencimento;
	private Double valor;

	public Parcelamento(Date dataDeVencimento, Double valor) {
		this.dataDeVencimento = dataDeVencimento;
		this.valor = valor;
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return sdf.format(dataDeVencimento) + " - " + String.format("%.2f", valor);
	}

}

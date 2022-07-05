package entities.services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcelamento;

public class CalculoDeParcelamento {

	private PagamentoOnline tax;

	public CalculoDeParcelamento(PagamentoOnline tax) {
		this.tax = tax;
	}

	public void processParc(Contrato contract, int parcelas) {
		double p = contract.getValue() / parcelas;
		for (int i = 1; i <= parcelas; i++) {
			double pvalue = p + p * (tax.TaxaDeParcelamento() * i);
			double tpvalue = pvalue + pvalue * tax.TaxaDePagamento();
			Date dates = addMonth(contract.getDate(), i);
			contract.getParcelamento().add(new Parcelamento(dates, tpvalue));
		}
	}
	
	private Date addMonth(Date data, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();

	}
}

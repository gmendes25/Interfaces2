package entities.services;

public class TaxasPaypal implements PagamentoOnline{
	public double TaxaDeParcelamento() {
		return 0.01;
	}
	public double TaxaDePagamento() {
		return 0.02;
	}
}

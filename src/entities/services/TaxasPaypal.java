package entities.services;

public class TaxasPaypal implements PagamentoOnline {
	// AtualizaçãoDaInterface
	public double TaxaDeParcelamento(Double valor, int parcelas) {
		double valorDaParcela = valor * 0.01 * parcelas;
		return valorDaParcela;
	}

	public double TaxaDePagamento(Double valor) {
		double valorDaParcela = valor * 0.02;
		return valorDaParcela;
	}
}

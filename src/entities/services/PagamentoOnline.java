package entities.services;

public interface PagamentoOnline {
	// AtualizaçãoDaInterface
	public double TaxaDeParcelamento(Double valor, int parcelas);

	public double TaxaDePagamento(Double valor);
}

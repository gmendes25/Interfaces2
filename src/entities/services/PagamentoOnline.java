package entities.services;

public interface PagamentoOnline {
	// Atualiza��oDaInterface
	public double TaxaDeParcelamento(Double valor, int parcelas);

	public double TaxaDePagamento(Double valor);
}

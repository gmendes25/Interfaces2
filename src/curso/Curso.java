package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelamento;
import entities.services.CalculoDeParcelamento;
import entities.services.TaxasPaypal;

public class Curso {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// DataCorrigida-"YYYY"
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de contrato: ");
		int numero = sc.nextInt();
		System.out.println("Data do contrato: ");
		Date data = sdf.parse(sc.next());
		System.out.println("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.println("Dividido de quantas vezes?");
		int parcela = sc.nextInt();

		Contrato contract = new Contrato(numero, data, valor);

		CalculoDeParcelamento cp = new CalculoDeParcelamento(new TaxasPaypal());

		cp.processParc(contract, parcela);

		for (Parcelamento p : contract.getParcelamento()) {
			System.out.println(p);
		}
		sc.close();
	}
}

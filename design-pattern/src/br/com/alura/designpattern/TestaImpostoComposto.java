package br.com.alura.designpattern;

public class TestaImpostoComposto {

	public static void main(String[] args) {

		Imposto iss = new ImpostoMuitoAlto(new ICMS());

		Orcamento orcamento = new Orcamento(500);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);

	}
}

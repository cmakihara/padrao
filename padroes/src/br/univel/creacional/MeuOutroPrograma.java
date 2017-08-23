package br.univel.creacional;

public class MeuOutroPrograma {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		c.mais(2)
		.mais(2)
		.resultado()
		.limpar()
		.resultado()
		.mais(6)
		.dividePor(3)
		.resultado()
		.limpar();
		

	}

}

package br.univel.creacional;

public class MeuPrograma {
	
	
	public static void main(String... args) {
		
		System.out.println(args[2]);
		
		CarroBuilder carroBuilder = new CarroBuilder();
		
		Carro c = carroBuilder
				.anoFab("1985")
				.marca("Honda")
				.modelo("Fit")
				.km("250000")
				.build();
		
	}

}

package br.univel.creacional.fluent;

public class CarroBuilder {
	
	private String id;
	private String marca;
	private String modelo;
	private String versao;
	private String anoFab;
	private String anoMod;
	private String potencia;
	private String torque;
	private String portas;
	private String pintura;
	private String km;
	private String cambio;
	private String placa;
	private String renavam;
	private String chassi;
	
	public CarroBuilder km(String km) {
		this.km =km;
		return this;
	}
	public CarroBuilder marca(String marca) {
		this.marca =marca;
		return this;
	}

	public CarroBuilder anoFab(String ano) {
		this.anoFab =ano;
		return this;
	}
	
	public CarroBuilder modelo(String modelo) {
		this.modelo =modelo;
		return this;
	}
	public Carro build() {
		
		return new Carro(this.id, this.marca,
				this.modelo, this.versao, 
				this.anoFab, this.anoMod,
				this.potencia,this.torque,
				this.portas, this.pintura, 
				this.km, this.cambio, 
				this.placa, this.renavam,
				this.chassi);
	}


}

package br.univel.creacional;

public class Carro {
	
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
	
	public Carro(){	
		
	}

	public Carro(String id, String marca, String modelo, String versao, String anoFab, String anoMod, String potencia,
			String torque, String portas, String pintura, String km, String cambio, String placa, String renavam,
			String chassi) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.versao = versao;
		this.anoFab = anoFab;
		this.anoMod = anoMod;
		this.potencia = potencia;
		this.torque = torque;
		this.portas = portas;
		this.pintura = pintura;
		this.km = km;
		this.cambio = cambio;
		this.placa = placa;
		this.renavam = renavam;
		this.chassi = chassi;
	}




	public String getId() {
		
	
	
		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}
	public String getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getTorque() {
		return torque;
	}
	public void setTorque(String torque) {
		this.torque = torque;
	}
	public String getPortas() {
		return portas;
	}
	public void setPortas(String portas) {
		this.portas = portas;
	}
	public String getPintura() {
		return pintura;
	}
	public void setPintura(String pintura) {
		this.pintura = pintura;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
}

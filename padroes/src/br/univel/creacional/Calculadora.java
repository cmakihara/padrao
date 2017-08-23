package br.univel.creacional;

public class Calculadora {
	
	private float resultado =0;
	
	public Calculadora mais(int num){
		this.resultado+=num;
		return this;
	}
	public Calculadora menos(int num){
		this.resultado-=num;
		return this;	
	}
	public Calculadora dividePor(int num){
		this.resultado=this.resultado/num;
		return this;
	}
	public Calculadora multiplicaPor(int num){
		this.resultado=this.resultado*num;
		return this;
	}
	public Calculadora limpar(){
		this.resultado = 0;
		return this;
	}
	public Calculadora resultado(){
		System.out.println(this.resultado);
		return this;
	}

}

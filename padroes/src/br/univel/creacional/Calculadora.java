package br.univel.creacional;

public class Calculadora {
	
	private float resultado =0;
	
	public Calculadora mais(int num){
		System.out.println("+"+num);
		this.resultado+=num;
		return this;
	}
	public Calculadora menos(int num){
		System.out.println("-"+num);
		this.resultado-=num;
		return this;	
	}
	public Calculadora dividePor(int num){
		System.out.println("/"+num);
		this.resultado=this.resultado/num;
		return this;
	}
	public Calculadora multiplicaPor(int num){
		System.out.println("*"+num);
		this.resultado=this.resultado*num;
		return this;
	}
	public Calculadora limpar(){		
		this.resultado = 0;
		System.out.println("C"+this.resultado);
		return this;
	}
	public Calculadora resultado(){
		System.out.println(this.resultado);
		return this;
	}

}

package br.uemg.livraia;

public interface Promocional {
	public static final double TAXA = 0.1;
	
	
	public abstract boolean aplicaDesconto(double valor);

	// a partir de java 18
	default public boolean aplicaDescontoDezPorcento() {
		
		return true;
	}



}

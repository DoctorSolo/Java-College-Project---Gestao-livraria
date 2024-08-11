package br.uemg.livraia;

public class CarrinhoDeCompras {
	private double totalVendas;
	
	
	public CarrinhoDeCompras() {
		totalVendas = 0;
	}
	
	
	public void insere(Produto prod) {
		System.out.println("Adicionando " + prod);
		// prod.aplicaDesconto(0.10);		// 10% DE DESCONTO
		totalVendas += prod.getPreco();
	}


	public double getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
}

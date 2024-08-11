package br.uemg.livraia;

public class Revista implements Produto, Promocional{
	private final double DESCONTO_REVISTA = 0.25;
	private String nome;
	private double preco;
	
	
	public Revista(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}


	@Override
	public String toString() {
		return "Revista [nome=" + nome + ", preco=" + preco + "]\n";
	}
	
	
	
	@Override
	public boolean aplicaDesconto(double valorDesconto) {
		if (valorDesconto > DESCONTO_REVISTA) {
			return false;
		}
		
		// desconto aplicavel
		setPreco(getPreco() - valorDesconto * getPreco());
		//super.aplicaDesconto(valorDesconto);
		return true;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}

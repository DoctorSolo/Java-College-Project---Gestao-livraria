package br.uemg.livraia;

public abstract class Livro implements Produto{
	private String titulo;
	private String autor;
	private double preco;

	
	// Contrutor
	public Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	@Override
	public double getPreco() {
		return preco;
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]\n";
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	// public abstract boolean aplicaDesconto(double valor); 
	//{
	//	if (valor > DESCONTO_LIVRO_FISICO) {
	//		return false;
	//	} else {
	//		// Valor do desconto
	//		preco -= valor * preco;
	//		return true;
	//	}
	//}
	
}

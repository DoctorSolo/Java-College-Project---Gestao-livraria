package br.uemg.livraia;

public class LivroFisico extends Livro implements Promocional{
	private final double DESCONTO_LIVRO_FISICO = 0.30;
	
	@Override
	public boolean aplicaDesconto(double valorDesconto) {
		if (valorDesconto > DESCONTO_LIVRO_FISICO) {
			return false;
		}
		
		// desconto aplicavel
		setPreco(getPreco() - valorDesconto * getPreco());
		//super.aplicaDesconto(valorDesconto);
		return true;
	}
	
	public LivroFisico(String titulo, String autor, double preco) {
		super(titulo, autor, preco);
	}

}

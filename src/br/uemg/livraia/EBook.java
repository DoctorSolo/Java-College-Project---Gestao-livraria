package br.uemg.livraia;

public class EBook extends Livro implements Promocional {
		private final double DESCONTO_LIVRO_EBOOK = 0.30;
		private String marcaDagua;
		
		private String arvore = new String();
		private Object object = new String();
		
		// Contrutor
		public EBook(String titulo, String autor, double preco, String md) {
			super(titulo, autor, preco);
			this.marcaDagua = md;
		}
		
		@Override
		public boolean aplicaDesconto(double valorDesconto) {
			if (valorDesconto > DESCONTO_LIVRO_EBOOK) {
				return false;
			}
			
			// desconto aplicavel
			setPreco(getPreco() - valorDesconto * getPreco());
			//super.aplicaDesconto(valorDesconto);
			return true;
		}
}

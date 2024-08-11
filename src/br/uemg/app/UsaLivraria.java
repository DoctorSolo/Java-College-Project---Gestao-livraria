package br.uemg.app;
import br.uemg.livraia.EBook;
import br.uemg.livraia.LivroFisico;
import br.uemg.livraia.MiniLivro;
import br.uemg.livraia.CarrinhoDeCompras;
import br.uemg.livraia.Revista;

public class UsaLivraria {

	public static void main(String[] args) {
		LivroFisico liv1	= new LivroFisico("Programando POO em java","John Doe", 300.00);
		EBook 		eb1 	= new EBook("Como programar em Java","Deitel & Deitel", 280.00, "mauro.hemerly@gmail.com");
		Revista 	rev1 	= new Revista("Byte Magazine", 100.00);
		
		CarrinhoDeCompras cc1 = new CarrinhoDeCompras();
		cc1.insere(liv1);
		cc1.insere(eb1);
		cc1.insere(rev1);
		
		System.out.println("Total de vendas: R$ "+ cc1.getTotalVendas());
	}

}

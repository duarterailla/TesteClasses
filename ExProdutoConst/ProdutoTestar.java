package ExProdutoConst;

public class ProdutoTestar {

	public static void main(String[] args) {
		
		//cosntrutor padarão
		Produto p1= new Produto();
		p1.nome= "Caneta preta";
		p1.marca ="Bic";
		p1.valor =1.50f;
		
		//construtor de dois parâmetros
		Produto p2= new Produto("Caneta vermelha", "Faber");
		p2.valor=1.69f;
		
		//construtor de três parâmetros
		Produto p3= new Produto("Borracha", "Mercur", 1.89f);
		
		System.out.println("Nome:"+ p1.nome + " Marca:" + p1.marca + " Valor:" + p1.valor);
		System.out.println("Nome:"+ p2.nome + " Marca:" + p2.marca + " Valor:" + p2.valor);
		System.out.println("Nome:"+ p3.nome + " Marca:" + p3.marca + " Valor:" + p3.valor);

	}
}

package excarro;

public class Carro {

	//atributos
	String nome;
	String marca;
	int ano; 
	int velocidade;
	
	//métodos - ações 
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
		}
	void frear(int reduzir) {
		velocidade-=reduzir;
		}
	void buzinar() {
		System.out.println("bibibibi");
		
	}
	
}
	
	


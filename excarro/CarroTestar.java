package excarro;

public class CarroTestar {

	public static void main(String[] args) {
		Carro c1= new Carro();
		c1.nome = "Uno";
		c1.marca = "Fiat";
		c1.ano = 2015;
		c1.velocidade = 60;
		
		c1.acelerar(40);
		System.out.println("Velocidade: "+ c1.velocidade+ "km/h");
		
		c1.frear(20);
		System.out.println("Velocidade: " + c1.velocidade+ "km/h");
	}
	
	
}

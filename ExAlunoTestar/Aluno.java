package ExAlunoTestar;

public class Aluno {

	//modificador de acesso para atributo nome: priivate.
		private String nome;
		private int idade;
	
		//método para acessar o atributo

		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() { 
			return nome;
		}
	
		public void setIdade(int idade) {
			if(idade>0 && idade<130) {
				this.idade = idade;
				System.out.println("Idade cadastrada!");
			}
			else {
				System.out.println("Iválida. Escreva uma idade correta.");
			}
			
		}
		
		
	
}

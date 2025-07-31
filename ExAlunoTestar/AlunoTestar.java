package ExAlunoTestar;

public class AlunoTestar {

	public static void main(String[] args) {
	
	Aluno aluno1 = new Aluno();
	
	//ex: aluno1.nome= "Thiago"; Antes do contrutor. Para dar certo, tem que adicionar o set.
	aluno1.setNome("Thiago");
	
	 System.out.println(aluno1.getNome());
	
	 aluno1.setIdade(500);

	
	}
	}

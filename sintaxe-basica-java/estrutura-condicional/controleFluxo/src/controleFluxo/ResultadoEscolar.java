package controleFluxo;

public class ResultadoEscolar {

	public static void main(String[] args) {
		
		// condicional composta - mais de uma condição, um fluxo para uma condição verdadeiar e um para falsa
		
		int nota = 6; // nota do aluno
		String aluno = "Rafael"; //nome do aluno (nao necessario)
		
		
		if(nota >= 7) // verificando se a nota é maior ou igual a declara/inserida
			System.out.println(aluno + " está aprovado"); // caso atenda, está linha sera impressa
		
		else if(nota >= 5 && nota < 7) // condicional encadeada - inumeras condições 
			System.out.println( aluno + " irá fazer prova de recuperação");
			
		else
			System.out.println(aluno + " está reprovado"); // caso não atenda, está linha sera impresa
	}

}

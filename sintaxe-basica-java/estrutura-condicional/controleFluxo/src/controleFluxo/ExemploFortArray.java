package controleFluxo;

public class ExemploFortArray {

	public static void main(String[] args) {
		
		//Em arrays o indice inicia em ZERO
		String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; //array de alunos do tipo string. cada nome nome, um elemento/aluno
		
		
		
//		for (int x = 0; x < alunos.length; x++) { // inicialização; condição; enquanto x < alunos; x++
//			
//			System.out.println("o aluno no indice x = " + x + " é " + alunos[x]); //imprime nome dos alunos por indice
//			
//		}
		
		
		
		//Forma abreviada
		
		for(String aluno : alunos) {
			
			System.out.println("nome do aluno é: " + aluno);
			
		}
		
		
		
	}

}

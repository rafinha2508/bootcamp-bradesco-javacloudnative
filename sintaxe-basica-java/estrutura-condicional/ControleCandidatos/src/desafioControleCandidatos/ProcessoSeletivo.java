package desafioControleCandidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String cadidato: candidatos) {
			entrandoEmContato(cadidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			 atendeu = atender();
			 continuarTentando = !atendeu;
			 if(continuarTentando)
				 tentativasRealizadas++;
			 else
				 System.out.println("CONTATO RELIZADO COM SUCESSO");
			 
		 }while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA(S)");
		else
			System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIXMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
	}
	
	// método auxiliar
	static boolean atender(){
		return new Random().nextInt(3)==1;
	}
		
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) { //não nos é necessario saber o indice de cada candidato
			System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato: candidatos) {
			System.out.println("o candidato selecionado foi " +  candidato);
		}
		
	}
	
	static void selecaoCandidatos(){
		//array com a lista de candidatos
		
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) { //candidatos, só pode selecionar 5, mas só pd selecionar enquantou houver pessoas na lista
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salario: R$" + salarioPretendido);
				if (salarioBase >= salarioPretendido) {
					System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
					candidatosSelecionados ++;
			}
			candidatosAtual++;
		} 
		
	}
	static double valorPretendido( ) {
		return ThreadLocalRandom.current().nextDouble(1800, 2200); // Gerador de salario aleatorio/escolhido por cada participante
	}
	
	static void analisarCandidato( double salarioPretendido){
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}

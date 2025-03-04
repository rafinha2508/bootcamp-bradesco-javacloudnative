package controleFluxo;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		
		for(int numero = 1; numero <=5; numero ++) {
			if(numero == 3)// Por mais q a condição determinasse que era de 1 a 5, qndo chega no n°3, if se torna verdadeiro e o break é acionado 
				
				continue; // Pula para a próxima iteração, assim mostrando 1, 2, 4 e 5
//				break; // Interrompe e não mostra 3, 4 e 5
			
			System.out.println(numero);
		}
		
	}

}

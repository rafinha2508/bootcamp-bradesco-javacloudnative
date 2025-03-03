package controleFluxo;

public class SistemaMedida {

	public static void main(String[] args) {

		String sigla = "M"; // tamanho de vestimenta
		
		switch (sigla) { // verifica o valor e executa o bloco correspondente
		
			case "P":{
				System.out.println("pequeno");
				break; // interrompe a execução do bloco, impedindo a execução dos proximos "case" 
			}
			
			case "M":{
				System.out.println("medio");
				break;
			}
			
			case "G":{
				System.out.println("grande");
				break;
			}
			
			default:{ // caso nenhum bloco seja correspondente, default sera executado
				System.out.println("indefinido");
			}		
		}
			

	}

}

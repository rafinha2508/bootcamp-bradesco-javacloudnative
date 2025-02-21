package OpRelacionais;

public class Main {

	public static void main(String[] args) {
		
		String nomeUm = "Rafael";
		String nomeDois = new String ("Rafael");
		
		System.out.println(nomeUm.equals(nomeDois));	//objetos e textos utilizamos "equals"
		
		
		
		int numero1 = 1; //salvados em um lugar da memoria
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
			if(numero1 < numero2) {
				System.out.println("a nossa condicao é verdadeira? ");
			}
				
		
		
			System.out.println("Numero 1 é igual a numero 2? " + simNao);
		
		simNao = numero1 != numero2;
			System.out.println("Numero 1 é difente de numero 2? " + simNao);
		
		simNao = numero1 > numero2;
			System.out.println("Numero 1 é maior que numero 2? " + simNao);		
		
		simNao = numero1 != numero2;
			System.out.println("Numero 1 é menor que numero 2? " + simNao);

	}
}
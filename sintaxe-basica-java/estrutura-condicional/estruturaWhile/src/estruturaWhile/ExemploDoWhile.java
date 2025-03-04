package estruturaWhile;
import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		System.out.println("Discando...");
		
		do {
			
			//executado repetiads vezes ate alguem atender
			System.out.println("Telefone tocando");
			
		}while(tocando());
		
		System.out.println("Alô!");
		
	}

	private static boolean tocando( ) {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("atendeu? " + atendeu); 
		
		//negando o ato de atender
		return ! atendeu;
	}
	
}

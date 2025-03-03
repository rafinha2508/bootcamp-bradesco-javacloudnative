package controleFluxo;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		// condicional simples - apenas uma condição
		
		double saldo = 25.0; 
		double valorSolicitado = 17.0;
		
		if(valorSolicitado < saldo)
			saldo = saldo - valorSolicitado;
			
			System.out.println(saldo);

			// caso o valorSolicitado atenda ao requisito, o programa funcionara normalmente
			// assim imprimindo o novo saldo
	}

}

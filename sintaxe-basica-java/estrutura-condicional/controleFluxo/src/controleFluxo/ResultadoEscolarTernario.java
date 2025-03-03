package controleFluxo;

public class ResultadoEscolarTernario {

	public static void main(String[] args) {
		
//		Cenário 1
//		int nota = 7;
//		String resultado = nota >= 7 ? "aprovado" : "reprovado";
//		System.out.println(resultado);

		
// 		Cenário 2
		int nota = 8;
		String resultado = nota >=7 ? "aprovado" : nota >=5 && nota <7 ? "recuperação" : "reprovado";
		System.out.println(resultado);
		
	}

}

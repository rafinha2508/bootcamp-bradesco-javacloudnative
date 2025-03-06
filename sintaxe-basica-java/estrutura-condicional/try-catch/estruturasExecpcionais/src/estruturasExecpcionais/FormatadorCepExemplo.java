package estruturasExecpcionais;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		
	try {	
		String cepFormatado = formatarCep("237650649");
		System.out.println(cepFormatado);
	} catch (CepInvalidoException e) {
		System.out.println("O CEP não corresponde as regras de negócios");
	}
	
	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8)
			throw new CepInvalidoException();
		
		//simulando um cep formatado
		
		return "23.765-054";
		
		
	}
	
}

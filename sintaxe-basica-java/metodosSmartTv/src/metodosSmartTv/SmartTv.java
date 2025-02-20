package metodosSmartTv;

public class SmartTv {

	boolean ligada=false;
	int canal = 1;
	int volume = 10;
	
	public void mudarCanal (int novoCanal){
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("aumentando volume para: " + volume);
	}
	
	public void abaixarVolume() {
		System.out.println("abaixando volume para: " + volume);
		volume--;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
}



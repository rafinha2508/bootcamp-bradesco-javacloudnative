package metodosSmartTv;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.abaixarVolume();
		smartTv.abaixarVolume();
		smartTv.abaixarVolume();
		smartTv.aumentarVolume();
		System.out.println("volume atual: " + smartTv.volume);
		
		System.out.println("canal atual: " + smartTv.canal);
		
		smartTv.mudarCanal(30);
		
		System.out.println("canal atual: " + smartTv.canal);
		
		System.out.println("tv ligada: " + smartTv.ligada);
		System.out.println("canal atual: " + smartTv.canal);
		System.out.println("volume atual: " + smartTv.volume);
		
		smartTv.ligar();
			System.out.println("novo status -> tv ligada? " + smartTv.ligada);
			
		smartTv.desligar();
			System.out.println("novo status -> tv ligada? " + smartTv.ligada);
	}

}

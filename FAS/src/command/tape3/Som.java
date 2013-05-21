package command.tape3;

public class Som {
	private int volume;
	public void ligar() {
		System.out.println("Som ligado");
	}
	
	public void desligar() {
		System.out.println("Som desligado");
	}

	public void definirCD() {
		System.out.println("Lendo CD");
	}

	public void definirDVD() {
		System.out.println("Lendo DVD");
	}

	public void definirRadio() {
		System.out.println("Buscando faixa");
	}

	public void definirVolume(int volume) {
		this.volume= volume;
		System.out.println("Volume "+ volume);
	}

}

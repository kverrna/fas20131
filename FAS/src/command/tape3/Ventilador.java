package command.tape3;

public class Ventilador {
	public static final int MAXIMO = 3;
	public static final int MEDIO = 2;
	public static final int MINIMO = 1;
	public static final int DESLIGADO = 0;
	
	int velocidade;
	String local;
	
	public Ventilador(String local){
		this.local = local;
	}
	
	public void definirMaximo() {
		velocidade = MAXIMO;
		
	}

	public void definirMinimo() {
		velocidade = MINIMO;
	}

	public void definirMedio() {
		velocidade = MEDIO;
	}

	public void desligar() {
		velocidade = DESLIGADO;
	}

	public int getVelocidade() {
		return velocidade;
	}


}

package command.tape4;

public class Ventilador {
	public static final int MAXIMO = 3;
	public static final int MEDIO = 2;
	public static final int MINIMO = 1;
	public static final int DESLIGADO = 0;
	
	int velocidade;
	int velocidadeAnterior;
	String local;
	
	public Ventilador(String local)
	{
		this.local = local;
		velocidadeAnterior=-1;
	}
	
	public void definirMaximo() 
	{
		velocidadeAnterior=velocidade;
		velocidade = MAXIMO;
		System.out.println("Ventilador na velocidade máxima");
		
	}

	public void definirMinimo() 
	{
		velocidadeAnterior=velocidade;
		velocidade = MINIMO;
		System.out.println("Ventilador na velocidade mínima");
	}

	public void definirMedio() 
	{
		velocidadeAnterior=velocidade;
		velocidade = MEDIO;
		System.out.println("Ventilador na velocidade média");
	}

	public void desligar() 
	{
		velocidadeAnterior=velocidade;
		velocidade = DESLIGADO;
		System.out.println("Ventilador desligado");
	}

	public int getVelocidade() {
		return velocidade;
	}
	public int getVelocidadeAnterior()
	{
		return velocidadeAnterior;
	}


}

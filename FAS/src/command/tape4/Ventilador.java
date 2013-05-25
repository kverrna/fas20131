package command.tape4;

public class Ventilador {
	public static final int MAXIMO = 3;
	public static final int MEDIO = 2;
	public static final int MINIMO = 1;
	public static final int DESLIGADO = 0;
	
	private int velocidade;
	private int velocidadeAnterior;
	private String local;
	
	public Ventilador(String local)
	{
		this.local = local;
		velocidade=-1;
	}
	
	public void definirMaximo() 
	{
		velocidadeAnterior=velocidade;
		velocidade = MAXIMO;
		System.out.println("Ventilador na velocidade maxima");
		
	}

	public void definirMinimo() 
	{
		velocidadeAnterior=velocidade;
		velocidade = MINIMO;
		System.out.println("Ventilador na velocidade minima");
	}

	public void definirMedio() 
	{
		velocidadeAnterior=velocidade;
		velocidade = MEDIO;
		System.out.println("Ventilador na velocidade media");
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
	public String getLocal()
	{
		return local;
	}

}

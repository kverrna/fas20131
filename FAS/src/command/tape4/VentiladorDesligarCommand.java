package command.tape4;

public class VentiladorDesligarCommand implements Command {

	private Ventilador ventilador;

	public VentiladorDesligarCommand(Ventilador ventilador) {
		this.ventilador = ventilador;
	}

	@Override
	public void execute() {
		ventilador.desligar();

	}
	public void undo()
	{
		if(ventilador.getVelocidadeAnterior()<0) ventilador.definirMaximo();
		else
		{
			switch(ventilador.getVelocidadeAnterior())
			{
			case 1:ventilador.definirMinimo();System.out.println("Ventilador religado na velocidade Minima");break;
			case 2:ventilador.definirMedio();System.out.println("Ventilador religado na velocidade Media");break;
			case 3:ventilador.definirMaximo();System.out.println("Ventilador religado na Maxima");break;
			 
			}
		
		}
	}

}

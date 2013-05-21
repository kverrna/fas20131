package command.tape4;

public class VentiladorLigarCommand implements Command {
	
	private Ventilador ventilador;
	
	public VentiladorLigarCommand(Ventilador ventilador){
		this.ventilador = ventilador;
	}
	
	@Override
	public void execute() {
		ventilador.definirMaximo();
	}

}

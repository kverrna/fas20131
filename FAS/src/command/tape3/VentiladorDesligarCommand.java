package command.tape3;

public class VentiladorDesligarCommand implements Command {

	private Ventilador ventilador;

	public VentiladorDesligarCommand(Ventilador ventilador) {
		this.ventilador = ventilador;
	}

	@Override
	public void execute() {
		ventilador.desligar();

	}

}

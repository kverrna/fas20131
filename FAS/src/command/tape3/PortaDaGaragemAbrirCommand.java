package command.tape3;

public class PortaDaGaragemAbrirCommand implements Command {
	PortaDaGaragem portaDaGaragem;

	public PortaDaGaragemAbrirCommand(PortaDaGaragem portaDaGaragem) {
		this.portaDaGaragem = portaDaGaragem;
	}

	public void execute() {
		portaDaGaragem.abrir();
	}
}

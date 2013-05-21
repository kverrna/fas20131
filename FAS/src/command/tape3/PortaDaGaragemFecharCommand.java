package command.tape3;

public class PortaDaGaragemFecharCommand implements Command {
	PortaDaGaragem portaDaGaragem;

	public PortaDaGaragemFecharCommand(PortaDaGaragem portaDaGaragem) {
		this.portaDaGaragem = portaDaGaragem;
	}

	public void execute() {
		portaDaGaragem.fechar();
	}
}

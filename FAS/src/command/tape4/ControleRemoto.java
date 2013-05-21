package command.tape4;

public class ControleRemoto {
	private Command[] commandsLigar;
	private Command[] commandsDesligar;

	public ControleRemoto() {
		commandsLigar = new Command[7];
		commandsDesligar = new Command[7];

		Command commandVazio = new CommandVazio();
		for (int i = 0; i < 7; i++) {
			commandsLigar[i] = commandVazio;
			commandsDesligar[i] = commandVazio;
		}
	}

	public void setCommand(int posicao, Command commandLigar,
			Command commandDesligar) {
		commandsLigar[posicao] = commandLigar;
		commandsDesligar[posicao] = commandDesligar;
	}

	public void botaoLigarPressionado(int posicao) {
		commandsLigar[posicao].execute();
	}

	public void botaoDesligarPressionado(int posicao) {
		commandsDesligar[posicao].execute();
	}

	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n ----- Controle Remoto ------ \n");
		for (int i = 0; i < commandsLigar.length; i++) {
			stringBuffer.append("[posicao " + i + "] "
					+ commandsLigar[i].getClass().getName() + "\t"
					+ commandsDesligar[i].getClass().getName() + "\n");

		}
		return stringBuffer.toString();
	}
}

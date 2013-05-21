package command.tape4;

public class LuzDesligarCommand implements Command {
	Luz luz;
 
	public LuzDesligarCommand(Luz luz) {
		this.luz = luz;
	}
 
	public void execute() {
		luz.desligar();
	}
}

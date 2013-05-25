package command.tape4;

public class LuzLigarCommand implements Command {
	Luz luz;
  
	public LuzLigarCommand(Luz luz) {
		this.luz = luz;
	}
 
	public void execute() {
		luz.ligar();
	}
	public void undo()
	{
		luz.desligar();
	}
}

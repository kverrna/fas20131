package command.tape1;

public class LuzLigarCommand implements Command {
	Luz luz;
  
	public LuzLigarCommand(Luz luz) {
		this.luz = luz;
	}
 
	public void execute() {
		luz.ligar();
	}
}

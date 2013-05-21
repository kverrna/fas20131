package command.tape4;

public class SomDesligarCommand implements Command {

	private Som som;
	
	public SomDesligarCommand(Som som){
		this.som = som;
	}
	
	@Override
	public void execute() {
		som.desligar();
	}

}


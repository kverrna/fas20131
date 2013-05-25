package command.tape4;

public class SomComCDCommand implements Command {

	private Som som;
	
	public SomComCDCommand(Som som){
		this.som = som;
	}
	
	@Override
	public void execute() {
		som.ligar();
		som.definirCD();
		som.definirVolume(200);
	}
	public void undo()
	{
		som.desligar();
	}

}


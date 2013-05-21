package command.tape4;

public class Luz {
	private String local;
	
	public Luz(String local) {
		this.local = local;
	}
	public void ligar() {
		System.out.println("Luz ligada");
	}
	public void desligar() {
		System.out.println("Luz desligada");
	}
	public String getLocal(){
		return local;
	}

}

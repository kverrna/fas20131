package command.tape4;

public class ControleRemotoSimples {
	Command posicao;
 
	public ControleRemotoSimples() {}
 
	public void setCommand(Command command) {
		posicao = command;
	}
 
	public void botaoPressionado() {
		posicao.execute();
	}
}

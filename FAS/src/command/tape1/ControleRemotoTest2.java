package command.tape1;

public class ControleRemotoTest2 {
	public static void main(String[] args) {
		ControleRemotoSimples controleRemoto = new ControleRemotoSimples();
		Luz luz = new Luz();
		PortaDaGaragem portaDaGaragem = new PortaDaGaragem();
		LuzLigarCommand luzLigar = new LuzLigarCommand(luz);
		PortaDaGaragemAbrirCommand garagemAbrir = 
		    new PortaDaGaragemAbrirCommand(portaDaGaragem);
 
		controleRemoto.setCommand(luzLigar);
		controleRemoto.botaoPressionado();
		controleRemoto.setCommand(garagemAbrir);
		controleRemoto.botaoPressionado();
    }
}

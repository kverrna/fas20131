package command.tape1;

public class ControleRemotoTest {
	public static void main(String[] args) {
		ControleRemotoSimples controleRemoto = new ControleRemotoSimples();
		Luz luz = new Luz();
		LuzLigarCommand luzLigar = new LuzLigarCommand(luz);
 
		controleRemoto.setCommand(luzLigar);
		controleRemoto.botaoPressionado();
    }
}

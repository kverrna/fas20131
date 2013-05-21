package command.tape3;

public class CarregarControle {

	public static void main(String[] args) {
		ControleRemoto controleRemoto = new ControleRemoto();

		Luz luzDaSala = new Luz("Luz da Sala de Estar");
		Luz luzDaCozinha = new Luz("Luz da Cozinha");
		Ventilador ventilador = new Ventilador("Quarto");
		PortaDaGaragem portaDaGaragem = new PortaDaGaragem();
		Som som = new Som();

		LuzLigarCommand luzDaSalaLigarCommand = new LuzLigarCommand(luzDaSala);
		LuzDesligarCommand luzDaSalaDesligarCommand = new LuzDesligarCommand(
				luzDaSala);

		LuzLigarCommand luzDaCozinhaLigarCommand = new LuzLigarCommand(
				luzDaCozinha);
		LuzDesligarCommand luzDaCozinhaDesligarCommand = new LuzDesligarCommand(
				luzDaCozinha);

		VentiladorLigarCommand ventiladorLigarCommand = new VentiladorLigarCommand(
				ventilador);
		VentiladorDesligarCommand ventiladorDesligarCommand = new VentiladorDesligarCommand(
				ventilador);

		PortaDaGaragemAbrirCommand portaDaGaragemAbrirCommand = new PortaDaGaragemAbrirCommand(
				portaDaGaragem);
		PortaDaGaragemFecharCommand portaDaGaragemFecharCommand = new PortaDaGaragemFecharCommand(
				portaDaGaragem);

		SomComCDCommand somComCDCommand = new SomComCDCommand(som);
		SomDesligarCommand somDesligarCommand = new SomDesligarCommand(som);

		controleRemoto.setCommand(0, luzDaSalaLigarCommand,
				luzDaSalaDesligarCommand);
		controleRemoto.setCommand(1, luzDaCozinhaLigarCommand,
				luzDaCozinhaDesligarCommand);
		controleRemoto.setCommand(2, ventiladorLigarCommand,
				ventiladorDesligarCommand);
		controleRemoto.setCommand(3, portaDaGaragemAbrirCommand,
				portaDaGaragemFecharCommand);
		controleRemoto.setCommand(4, somComCDCommand, somDesligarCommand);

		System.out.println(controleRemoto);

		controleRemoto.botaoLigarPressionado(1);
		controleRemoto.botaoDesligarPressionado(1);

		controleRemoto.botaoLigarPressionado(2);
		controleRemoto.botaoDesligarPressionado(2);

		controleRemoto.botaoLigarPressionado(3);
		controleRemoto.botaoDesligarPressionado(3);

		controleRemoto.botaoLigarPressionado(4);
		controleRemoto.botaoDesligarPressionado(4);

	}
}

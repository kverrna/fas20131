package command.tape4;

public class ControleRemotoRamon
{
	public static void main(String args[])
	{
		
		// 1 Criar o controle Remoto da bagunca
		ControleRemoto controleRamon=new ControleRemoto();
		
		// 2 criar Objetos do controle Remoto
		
		Ventilador ventilador= new Ventilador("sala de estar");
		Luz luzSalaEstar =new Luz("Sala de estar");
		Luz luzCozinha=new Luz("Cozinha");
		Som som =new Som();
		
		// 3 criar os camando dos objentos 
		
		VentiladorLigarCommand ventiladorLigarComando= new VentiladorLigarCommand(ventilador);
		VentiladorDesligarCommand ventiladorDesligarComando=new VentiladorDesligarCommand(ventilador);
		
		LuzLigarCommand luzSalaEstarLigar= new LuzLigarCommand(luzSalaEstar);
		LuzDesligarCommand luzSalaEstarDesligar=new LuzDesligarCommand(luzSalaEstar);
		
		LuzLigarCommand luzCozinhaLigar =new LuzLigarCommand(luzCozinha);
		LuzDesligarCommand luzCozinhaDesligar =new LuzDesligarCommand(luzCozinha);
		
		SomComCDCommand somLigar =new SomComCDCommand(som);
		SomDesligarCommand somDesligar=new SomDesligarCommand(som);
		
		
		
		//4 configure os comandos 
		
		controleRamon.setCommand(1, luzSalaEstarLigar, luzSalaEstarDesligar);
		controleRamon.setCommand(2, luzCozinhaLigar, luzCozinhaDesligar);
		controleRamon.setCommand(3, somLigar, somDesligar);// Som para incomodar o bairro inteiro 
		controleRamon.setCommand(4, ventiladorLigarComando, ventiladorDesligarComando);// o trem vai pegar fogo.. liga e ventilador no máximo
		
		
		
		System.out.println(controleRamon);
		
		//5 use o controle remoto
		
		System.out.println("\nLiga tudo!!! .. ta na hora de fazer o frevo ... passamos em FAS  =D");
		
		controleRamon.botaoLigarPressionado(1);
		controleRamon.botaoLigarPressionado(2);
		controleRamon.botaoLigarPressionado(3);
		controleRamon.botaoLigarPressionado(4);
		
		System.out.println("\n\n===Ferrou, algum vizinho chamou a policia >:(\n" );
		  
		controleRamon.botaoDesligarPressionado(1);
		controleRamon.botaoDesligarPressionado(2);
		controleRamon.botaoDesligarPressionado(3);
		controleRamon.botaoDesligarPressionado(4);
		
		
		
		
	}
}

/* Dionlan ideia 
public void botaoDesfazerPressionado(int posicao)
{
	if (commandsLigar.equals(true))
	{
		commandsDesligar[posicao].execute();
	}else
	{
		commandsLigar[posicao].execute();
	}
}
*/
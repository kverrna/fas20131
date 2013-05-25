package command.tape4;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ControleRemotoRamonTest {

	@Test
	public void testaRecivers()
	{
		
		Luz luz = new Luz("string");
		PortaDaGaragem portaGaragem = new PortaDaGaragem();
		Som som = new Som();
		Ventilador ventilador= new Ventilador("string");
		
		// instanciacao 
		Assert.assertNotNull(luz.getClass().getName());
		Assert.assertNotNull(portaGaragem.getClass().getName());
		Assert.assertNotNull(som.getClass().getName());
		Assert.assertNotNull(ventilador.getClass().getName());
		
		Assert.assertEquals("string", luz.getLocal());
		Assert.assertEquals("string", ventilador.getLocal());
		
		//testa acoes 
		
		luz.ligar();
		luz.desligar();
		portaGaragem.abrir();
		portaGaragem.fechar();
		portaGaragem.ligarLuz();
		portaGaragem.desligarLuz();
		portaGaragem.parar();
		som.definirCD();
		som.definirVolume(12);
		som.definirDVD();
		som.definirRadio();
		som.ligar();
		som.desligar();
		
		
		Assert.assertEquals(12, som.getVolume());
		som.desligar();
		ventilador.definirMaximo();
		Assert.assertEquals(3,ventilador.getVelocidade());
		Assert.assertEquals(-1,ventilador.getVelocidadeAnterior());
		
		ventilador.definirMedio();
		Assert.assertEquals(2,ventilador.getVelocidade());
		Assert.assertEquals(3,ventilador.getVelocidadeAnterior());
		
		ventilador.definirMinimo();
		Assert.assertEquals(1,ventilador.getVelocidade());
		Assert.assertEquals(2,ventilador.getVelocidadeAnterior());
		
		ventilador.desligar();
		Assert.assertEquals(0,ventilador.getVelocidade());
		Assert.assertEquals(1,ventilador.getVelocidadeAnterior());

	}
	
	@Test
	public void testaConcreteCommands()
	{
		Luz luz = new Luz("string");
		PortaDaGaragem portaGaragem = new PortaDaGaragem();
		Som som = new Som();
		Ventilador ventilador= new Ventilador("string");
		
		LuzDesligarCommand luzDesliga= new LuzDesligarCommand(luz);
		LuzLigarCommand luzLiga = new LuzLigarCommand(luz);
		
		PortaDaGaragemAbrirCommand portaAbre = new PortaDaGaragemAbrirCommand(portaGaragem);
		PortaDaGaragemFecharCommand portaFecha =new PortaDaGaragemFecharCommand(portaGaragem);
		
		SomComCDCommand somLiga = new SomComCDCommand(som);
		SomDesligarCommand somDesliga = new SomDesligarCommand(som);
		
		VentiladorDesligarCommand ventiladorDesliga = new VentiladorDesligarCommand(ventilador);
		VentiladorLigarCommand ventiladorLiga = new VentiladorLigarCommand(ventilador);
		
		Assert.assertNotNull(luzLiga.getClass().getName());
		Assert.assertNotNull(luzDesliga.getClass().getName());
		Assert.assertNotNull(portaAbre.getClass().getName());
		Assert.assertNotNull(portaFecha.getClass().getName());
		Assert.assertNotNull(somLiga.getClass().getName());
		Assert.assertNotNull(somDesliga.getClass().getName());
		Assert.assertNotNull(ventiladorDesliga.getClass().getName());
		Assert.assertNotNull(ventiladorLiga.getClass().getName());
		
		//Testa execute()
		
		luzLiga.execute();
		luzLiga.undo();
		luzDesliga.execute();
		luzDesliga.undo();
		
		portaAbre.execute();
		portaAbre.undo();
		portaFecha.execute();
		portaFecha.undo();
		
		somLiga.execute();
		somLiga.undo();
		somDesliga.execute();
		somDesliga.undo();
		
		ventiladorLiga.execute();
		Assert.assertEquals(3, ventilador.getVelocidade());
		ventiladorLiga.undo();
		Assert.assertEquals(0, ventilador.getVelocidade());
		
		ventiladorLiga.execute();
		ventiladorDesliga.execute();
		Assert.assertEquals(3, ventilador.getVelocidadeAnterior());
		Assert.assertEquals(0, ventilador.getVelocidade());
		ventiladorDesliga.undo();
		Assert.assertEquals(3, ventilador.getVelocidade());
		
	}
	
	@Test
	public void testaInvokers()
	{
		
		ControleRemoto controleRemoto=new ControleRemoto();
		
		Assert.assertNotNull(controleRemoto.getClass().getName());
		
		Ventilador ventilador= new Ventilador("string");
		
		VentiladorDesligarCommand ventiladorDesliga = new VentiladorDesligarCommand(ventilador);
		VentiladorLigarCommand ventiladorLiga = new VentiladorLigarCommand(ventilador);
	
		controleRemoto.setCommand(1, ventiladorLiga, ventiladorDesliga);
		controleRemoto.toString();
		
		controleRemoto.botaoLigarPressionado(1);
		Assert.assertEquals(3, ventilador.getVelocidade());
		
		controleRemoto.botaoDesligarPressionado(1);
		Assert.assertEquals(0, ventilador.getVelocidade());
		
		controleRemoto.botaoDesfazerDesligar(1);
		Assert.assertEquals(3, ventilador.getVelocidade());
		
		
	
	}
	@Test
	public void testaOutrasClasses()
	{
		CarregarControle carregar = new CarregarControle();
		carregar.main(null);
		CommandVazio command = new CommandVazio();
		command.execute();
		command.undo();
		
		ControleRemotoSimples controleSimples = new ControleRemotoSimples();
		controleSimples.setCommand(command);
		controleSimples.botaoPressionado();
		
		ControleRemotoRamon controleRamon = new ControleRemotoRamon();
		controleRamon.main(null);
		
		
	}

}

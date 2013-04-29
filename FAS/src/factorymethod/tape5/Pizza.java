package factorymethod.tape5;

import java.util.ArrayList;

public class Pizza {

	String nome;
	String massa;
	String molho;
	ArrayList<String> ingredientes = new ArrayList<String>();

	public void preparar() {
		System.out.println("Preparando a " + nome);
		System.out.println("Abrindo a massa...");
		System.out.println("Colocando o molho...");
		System.out.println("Adicionando os ingredientes: ");
		for (int i = 0; i < ingredientes.size(); i++) {
			System.out.println("   " + ingredientes.get(i));

		}

	}

	public void assar() {
		System.out.println("Assando por 30 min a 350 graus");
	}

	public void cortar() {
		System.out.println("Cortando a pizza em pedaços diagonais");

	}

	public void empacotar() {
		System.out.println("Empacotando a pizza com a caixa oficial da Pizzaria UnB");

	}

	String getName() {
		return nome;
	}

}

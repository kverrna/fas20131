package abstractfactory.tape1;

public abstract class Pizza {

	String nome;
	Massa massa;
	Molho molho;
	Queijo queijo;
	Vegetal vegetais[];

	public abstract void preparar() ;

	public void assar() {
		System.out.println("Assando por 30 min a 350 graus");
	}

	public void cortar() {
		System.out.println("Cortando a pizza em pedaços diagonais");

	}

	public void empacotar() {
		System.out.println("Empacotando a pizza com a caixa oficial da Pizzaria UnB");

	}

	String getNome() {
		return nome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}

}

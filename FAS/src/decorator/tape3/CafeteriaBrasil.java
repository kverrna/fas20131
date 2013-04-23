package decorator.tape3;

public class CafeteriaBrasil {

	
	public static void main(String[] args) {
		Bebida bebida = new Expresso();
		System.out.println(bebida.getDescricao() + " R$ "+bebida.preco());
		
		Bebida bebida2 = new TorraEscura();
		bebida2 = new Chocolate(bebida2);
		bebida2 = new Chocolate(bebida2);
		bebida2 = new Chantilly(bebida2);
		System.out.println(bebida2.getDescricao() + " R$ "+bebida2.preco());
		
		Bebida bebida3 = new MisturaDaCasa();
		bebida3 = new Soja(bebida3);
		bebida3 = new Chantilly(bebida3);
		bebida3 = new Chocolate(bebida3);
		bebida3 = new Chantilly(bebida3);
		bebida3 = new Chantilly(bebida3);
		bebida3 = new Soja(bebida3);
		bebida3 = new Soja(bebida3);
		bebida3 = new Chantilly(bebida3);
		bebida3 = new Chocolate(bebida3);
		bebida3 = new Leite(bebida3);
		
		System.out.println(bebida3.getDescricao() + " R$ "+ bebida3.preco());

		
	}

}

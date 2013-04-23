package decorator.tape3;

public class Descafeinado extends Bebida {

	@Override
	public String getDescricao() {
		return "Cafe Descafeinado";
	}

	@Override
	public double preco() {
		return 2.5;

	}

}

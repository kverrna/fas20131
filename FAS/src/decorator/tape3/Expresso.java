package decorator.tape3;

public class Expresso extends Bebida {

	@Override
	public String getDescricao() {
		return "Cafe Expresso";
	}

	@Override
	public double preco() {
		return 3.0;

	}

}

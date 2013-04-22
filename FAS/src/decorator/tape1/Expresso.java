package decorator.tape1;


public class Expresso extends Bebida {

	@Override
	public float preco() {
		return 3.0f + super.preco();

	}

}

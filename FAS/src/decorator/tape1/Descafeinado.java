package decorator.tape1;


public class Descafeinado extends Bebida {

	@Override
	public float preco() {
		return 2.50f + super.preco();

	}

}

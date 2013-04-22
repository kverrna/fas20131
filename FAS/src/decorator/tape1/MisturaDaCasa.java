package decorator.tape1;


public class MisturaDaCasa extends Bebida {

	@Override
	public float preco() {
		return 3.10f + super.preco();

	}

}

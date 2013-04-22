package decorator.tape1;


public class TorraEscura extends Bebida {

	@Override
	public float preco() {
		return 3.50f + super.preco();

	}

}

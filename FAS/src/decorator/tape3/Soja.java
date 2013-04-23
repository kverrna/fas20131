package decorator.tape3;

public class Soja extends CondimentosDecorator {

	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Soja";
	}

	/**
		 */
	public Soja(Bebida bebida) {
		this.bebidaWrapped = bebida;
	}

	@Override
	public double preco() {
		return 0.80 + bebidaWrapped.preco();
	}

}

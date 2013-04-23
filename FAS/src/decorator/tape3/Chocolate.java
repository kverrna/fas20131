package decorator.tape3;

public class Chocolate extends CondimentosDecorator {

	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Chocolate";
	}

	/**
		 */
	public Chocolate(Bebida bebida) {
		this.bebidaWrapped = bebida;
	}

	@Override
	public double preco() {
		return 0.60 + bebidaWrapped.preco();
	}

}

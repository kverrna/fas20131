package decorator.tape3;

public class Chantilly extends CondimentosDecorator {

	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Chantilly";
	}

	@Override
	public double preco() {
		return 0.30 + bebidaWrapped.preco();
	}

	/**
		 */
	public Chantilly(Bebida bebidaWrapped) {
		this.bebidaWrapped = bebidaWrapped;
	}

}

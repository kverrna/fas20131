package decorator.pratica;


public abstract class CondimentosDecorator extends Bebida {

	@Override
	public abstract String getDescricao();

	@Override
	public abstract double preco();

}

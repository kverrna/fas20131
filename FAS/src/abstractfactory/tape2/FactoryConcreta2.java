package abstractfactory.tape2;

public class FactoryConcreta2 implements FactoryAbstrata{

	@Override
	public ProdutoAbstratoA criarProdutoA() {
		return new ProdutoA2();

	}

	@Override
	public ProdutoAbstratoB criarProdutoB() {
		return new ProdutoB2();
	}

}

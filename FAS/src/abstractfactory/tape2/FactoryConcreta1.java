package abstractfactory.tape2;

public class FactoryConcreta1 implements FactoryAbstrata{

	@Override
	public ProdutoAbstratoA criarProdutoA() {
		return new ProdutoA1();
	}

	@Override
	public ProdutoAbstratoB criarProdutoB() {
		return new ProdutoB1();
	}

}

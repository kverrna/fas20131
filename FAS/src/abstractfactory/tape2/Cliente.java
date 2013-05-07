package abstractfactory.tape2;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProdutoAbstratoA produtoAbstratoA = null;
		ProdutoAbstratoB produtoAbstratoB = null;
		
		FactoryAbstrata factoryAbstrata = new FactoryConcreta1();
		
		produtoAbstratoA = factoryAbstrata.criarProdutoA();
		produtoAbstratoB = factoryAbstrata.criarProdutoB();
		

	}

}

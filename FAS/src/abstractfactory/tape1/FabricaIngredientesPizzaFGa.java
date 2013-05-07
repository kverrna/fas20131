package abstractfactory.tape1;

/**
 * @uml.dependency   supplier="abstractfactory.tape1.Massa"
 */
public class FabricaIngredientesPizzaFGa implements FabricaIngredientesPizza {

	@Override
	public Massa criarMassa() {
		return new MassaGrossa();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoMarinara();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoGouda();
	}

	@Override
	public Vegetal[] criarVegetais() {
		Vegetal vegetais[] = {new Abobrinha(), new Paris(), new PimentaoAmarelo()};
		return vegetais;
	}

}

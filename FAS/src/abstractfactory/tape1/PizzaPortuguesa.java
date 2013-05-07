package abstractfactory.tape1;

public class PizzaPortuguesa extends Pizza {

	FabricaIngredientesPizza fabricaIngredientesPizza;
	public PizzaPortuguesa(FabricaIngredientesPizza fabricaIngredientesPizza) {
		this.fabricaIngredientesPizza = fabricaIngredientesPizza;
	}

	@Override
	public void preparar() {
		System.out.println("Preparando "+ nome);
		massa = fabricaIngredientesPizza.criarMassa();
		molho = fabricaIngredientesPizza.criarMolho();
		queijo = fabricaIngredientesPizza.criarQueijo();
		vegetais = fabricaIngredientesPizza.criarVegetais();

	}

}

package factorymethod.tape4;

public class PizzariaUnB {

	PizzaFactorySimples factory;

	public PizzariaUnB(PizzaFactorySimples factory) {
		this.factory = factory;
	}

	Pizza pedirPizza(String tipo) {
		Pizza pizza;

		pizza = factory.criarPizza(tipo);
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.empacotar();
		return pizza;
	}
}

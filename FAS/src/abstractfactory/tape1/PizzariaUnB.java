package abstractfactory.tape1;

public abstract class PizzariaUnB {

	public Pizza pedirPizza(String tipo) {
		Pizza pizza;

		pizza = criarPizza(tipo);
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.empacotar();
		return pizza;
	}

	abstract Pizza criarPizza(String tipo) ;
}



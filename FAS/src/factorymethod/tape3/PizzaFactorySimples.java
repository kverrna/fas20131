package factorymethod.tape3;

public class PizzaFactorySimples {
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;

		if (tipo.equals("queijo")) {
			pizza = new PizzaDeQueijo();
		} else if (tipo.equals("calabreza")) {
			pizza = new PizzaDeCalabreza();
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaDePortuguesa();
		}
		return pizza;
	}
}





package abstractfactory.tape0;

public class PizzariaDarcy extends PizzariaUnB {
	
	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		if (tipo.equals("queijo")) {
			pizza = new PizzaDeQueijoDarcy();
		} else if (tipo.equals("calabreza")) {
			pizza = new PizzaDeCalabrezaDarcy();
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaDePortuguesaDarcy();
		}
		return pizza;
	}

}

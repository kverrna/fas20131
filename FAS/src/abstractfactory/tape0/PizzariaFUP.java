package abstractfactory.tape0;

public class PizzariaFUP extends PizzariaUnB {
	
	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		if (tipo.equals("queijo")) {
			pizza = new PizzaDeQueijoFUP();
		} else if (tipo.equals("calabreza")) {
			pizza = new PizzaDeCalabrezaFUP();
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaDePortuguesaFUP();
		}
		return pizza;
	}

}

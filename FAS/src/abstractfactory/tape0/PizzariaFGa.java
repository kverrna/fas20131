package abstractfactory.tape0;

public class PizzariaFGa extends PizzariaUnB {
	
	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		if (tipo.equals("queijo")) {
			pizza = new PizzaDeQueijoFGa();
		} else if (tipo.equals("calabreza")) {
			pizza = new PizzaDeCalabrezaFGa();
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaDePortuguesaFGa();
		}
		return pizza;
	}
}

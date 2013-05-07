package abstractfactory.tape0;

public class PizzariaDependente {

	public Pizza createPizza(String estilo, String tipo) {
		Pizza pizza = null;
		if (estilo.equals("FGa")) {
			if (tipo.equals("queijo"))
				pizza = new PizzaDeQueijoFGa();
			else if (tipo.equals("portuguesa"))
				pizza = new PizzaDePortuguesaFGa();
			else if (tipo.equals("calabreza"))
				pizza = new PizzaDeCalabrezaFGa();
		} else if (estilo.equals("Darcy")) {
			if (tipo.equals("queijo"))
				pizza = new PizzaDeQueijoDarcy();
			else if (tipo.equals("portuguesa"))
				pizza = new PizzaDePortuguesaDarcy();
			else if (tipo.equals("calabreza"))
				pizza = new PizzaDeCalabrezaDarcy();
		} else {
			System.out.println("Erro: tipo de pizza inválido");
			return null;
		}

		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.empacotar();

		return pizza;
	}
}

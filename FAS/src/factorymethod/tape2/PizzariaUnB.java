package factorymethod.tape2;

public class PizzariaUnB {
	Pizza pedirPizza(String tipo){
		
		Pizza pizza = null;
		
		if (tipo.equals("queijo")){
			pizza = new PizzaDeQueijo();
		} else if (tipo.equals("calabreza")){
			pizza = new PizzaDeCalabreza();
		} else if (tipo.equals("portuguesa")){
			pizza = new PizzaDePortuguesa();
		}
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		return pizza;
	}
}







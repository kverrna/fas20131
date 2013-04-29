package factorymethod.tape1;

public class PizzariaUnB {
	Pizza pedirPizza(String tipo){
		
		Pizza pizza = null;
		
		if (tipo.equals("queijo")){
			pizza = new PizzaDeQueijo();
		} else if (tipo.equals("presunto")){
			pizza = new PizzaDePresunto();
		} else if (tipo.equals("calabreza")){
			pizza = new PizzaDeCalabreza();
		}		
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		return pizza;
	}
}







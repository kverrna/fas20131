package factorymethod.tape0;

public class PizzariaUnB {
	Pizza pedirPizza(){
		Pizza pizza = new Pizza();
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		return pizza;
	}
}







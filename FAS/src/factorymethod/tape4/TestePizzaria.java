package factorymethod.tape4;

public class TestePizzaria {
	
	public void teste(){
	
	PizzaFactoryFGa pizzaFactoryFGa = new PizzaFactoryFGa();
	PizzariaUnB pizzariaFGa = new PizzariaUnB(pizzaFactoryFGa);
	pizzariaFGa.pedirPizza("calabreza");
	
	
	PizzaFactoryFUP pizzaFactoryFUP = new PizzaFactoryFUP();
	PizzariaUnB pizzariaFUP = new PizzariaUnB(pizzaFactoryFUP);
	pizzariaFUP.pedirPizza("portuguesa");
	
	PizzaFactoryDarcy pizzaFactoryDarcy = new PizzaFactoryDarcy();
	PizzariaUnB pizzariaDarcy = new PizzariaUnB(pizzaFactoryDarcy);
	pizzariaDarcy.pedirPizza("queijo");
	
	
	pizzaFactoryFGa.criarPizza("calabreza");
	
	pizzaFactoryFUP.criarPizza("queijo");
	
	pizzaFactoryDarcy.criarPizza("portuguesa");

	
	}
	
}


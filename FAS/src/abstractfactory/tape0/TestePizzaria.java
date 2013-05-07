package abstractfactory.tape0;

public class TestePizzaria {
	public static void main(String[] args) {
		PizzariaUnB pizzariaFGa = new PizzariaFGa();
		PizzariaUnB pizzariaDarcy = new PizzariaDarcy();
		
		Pizza pizza = pizzariaFGa.pedirPizza("queijo");
		System.out.println("Fabricio pediu uma: "+ pizza.getName()+ "\n");
		

		pizza = pizzariaDarcy.pedirPizza("queijo");
		System.out.println("Thiago pediu uma : "+ pizza.getName()+ "\n");

	}

}

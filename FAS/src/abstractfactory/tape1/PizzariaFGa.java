package abstractfactory.tape1;

public class PizzariaFGa extends PizzariaUnB {
	
	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		FabricaIngredientesPizza fabricaIngredientesPizza = new FabricaIngredientesPizzaFGa();
		
		if (tipo.equals("queijo")) {
			pizza = new PizzaDeQueijo(fabricaIngredientesPizza);
			pizza.setNome("Pizza de Queijo da FGa");
		} else if (tipo.equals("vegerariana")) {
			pizza = new PizzaVegerariana(fabricaIngredientesPizza);
			pizza.setNome("Pizza Vegetariana da FGa");
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaPortuguesa(fabricaIngredientesPizza);
			pizza.setNome("Pizza Porguesa da FGa");
		}
		return pizza;
	}
}

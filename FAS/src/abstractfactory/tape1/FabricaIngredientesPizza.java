package abstractfactory.tape1;

public interface FabricaIngredientesPizza {
	
	public Massa criarMassa();
	public Molho criarMolho();
	public Queijo criarQueijo();
	public Vegetal[] criarVegetais();

}

package abstractfactory.tape1;

public class FabricaIngredientesPizzaDarcy implements FabricaIngredientesPizza {

	@Override
	public Massa criarMassa() {
		return new MassaFina();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoTomadePelado();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public Vegetal[] criarVegetais() {
		Vegetal vegetais[] = {new Berinjela(), new Chumeji(), new PimentaoVermelho()};
		return vegetais;
	}

	/** 
	 * @uml.property name="queijoGouda"
	 * @uml.associationEnd inverse="fabricaIngredientesPizzaDarcy:abstractfactory.tape1.QueijoGouda"
	 */
	private QueijoGouda queijoGouda;

	/** 
	 * Getter of the property <tt>queijoGouda</tt>
	 * @return  Returns the queijoGouda.
	 * @uml.property  name="queijoGouda"
	 */
	public QueijoGouda getQueijoGouda() {
		return queijoGouda;
	}

	/** 
	 * Setter of the property <tt>queijoGouda</tt>
	 * @param queijoGouda  The queijoGouda to set.
	 * @uml.property  name="queijoGouda"
	 */
	public void setQueijoGouda(QueijoGouda queijoGouda) {
		this.queijoGouda = queijoGouda;
	}

}

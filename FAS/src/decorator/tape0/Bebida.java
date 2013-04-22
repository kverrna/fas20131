package decorator.tape0;


public abstract class Bebida {

	/**
	 * @uml.property  name="descricao"
	 */
	private String descricao;

	/**
	 * Getter of the property <tt>descricao</tt>
	 * @return  Returns the descricao.
	 * @uml.property  name="descricao"
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Setter of the property <tt>descricao</tt>
	 * @param descricao  The descricao to set.
	 * @uml.property  name="descricao"
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

		
		/**
		 */
		public abstract void preco();

}

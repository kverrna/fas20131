package decorator.tape3;



public class Chocolate extends CondimentosDecorator {

	Bebida bebidaWrapped;
	@Override
	public String getDescricao(){
		return this.bebidaWrapped.getDescricao() + ", Chocolate";
	}
		
		/**
		 */
		public Chocolate(Bebida bebida){
			this.bebidaWrapped= bebida;
		}

		@Override
		public float preco() {
			return 0.60f + bebidaWrapped.preco();
		}


}

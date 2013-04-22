package decorator.tape3;


public class Soja extends CondimentosDecorator {

	Bebida bebidaWrapped;
	@Override
	public String getDescricao(){
		return this.bebidaWrapped.getDescricao() + ", Soja";
	}
		
		/**
		 */
		public Soja(Bebida bebida){
			this.bebidaWrapped= bebida;
		}

		@Override
		public float preco() {
			// TODO Auto-generated method stub
			return 1.50f + bebidaWrapped.preco();
		}

}

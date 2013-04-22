package decorator.tape3;

public class Leite extends CondimentosDecorator {
	Bebida bebidaWrapped;
	@Override
	public String getDescricao(){
		return this.bebidaWrapped.getDescricao() + ", Leite";
	}
		
		/**
		 */
		public Leite(Bebida bebida){
			this.bebidaWrapped= bebida;
		}

		@Override
		public float preco() {
			// TODO Auto-generated method stub
			return .90f + bebidaWrapped.preco();
		}

}

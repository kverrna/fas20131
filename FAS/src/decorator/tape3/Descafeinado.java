package decorator.tape3;



public class Descafeinado extends Bebida {
	
	@Override
	public String getDescricao(){
		return "Caf� Descafeinado";
	}

	@Override
	public float preco() {
		return 2.50f ;

	}

}

package decorator.tape3;


public class Expresso extends Bebida {
	
	@Override
	public String getDescricao(){
		return "Caf� Expresso";
	}

	@Override
	public float preco() {
		return 3.0f ;

	}

}

package decorator.tape3;


public class Expresso extends Bebida {
	
	@Override
	public String getDescricao(){
		return "Café Expresso";
	}

	@Override
	public float preco() {
		return 3.0f ;

	}

}

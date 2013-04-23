package decorator.pratica;

public class Expresso extends Bebida {
	
	public Expresso(Tamanhos tamanho) {
		super.setTamanho(tamanho);
	}


	@Override
	public String getDescricao() {
		return "Cafe Expresso";
	}

	@Override
	public double preco() {
		double preco = 0;
		if (super.getTamanho() == Tamanhos.PEQUENO) {
			preco = 2.25;
		} else if (super.getTamanho() == Tamanhos.MEDIO) {
			preco = 3.45;
		} else if (super.getTamanho() == Tamanhos.GRANDE) {
			preco = 4.5;
		}
		return preco;
	}

}

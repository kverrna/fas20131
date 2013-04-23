package decorator.pratica;
public class MisturaDaCasa extends Bebida {
	
	public MisturaDaCasa(Tamanhos tamanho) {
		super.setTamanho(tamanho);
	}
	

	@Override
	public String getDescricao() {
		return "Cafe Mistura da Casa";
	}

	@Override
	public double preco() {
		double preco = 0;
		if (super.getTamanho() == Tamanhos.PEQUENO) {
			preco = 2.33;
		} else if (super.getTamanho() == Tamanhos.MEDIO) {
			preco = 3.57;
		} else if (super.getTamanho() == Tamanhos.GRANDE) {
			preco = 4.65;
		}
		return preco;
	}
}

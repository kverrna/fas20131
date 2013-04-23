package decorator.pratica;
public class Descafeinado extends Bebida {

	public Descafeinado(Tamanhos tamanho) {
		super.setTamanho(tamanho);
	}

	@Override
	public String getDescricao() {
		return "Cafe Descafeinado";
	}

	@Override
	public double preco() {
		double preco = 0;
		if (super.getTamanho() == Tamanhos.PEQUENO) {
			preco = 1.88;
		} else if (super.getTamanho() == Tamanhos.MEDIO) {
			preco = 2.88;
		} else if (super.getTamanho() == Tamanhos.GRANDE) {
			preco = 3.75;
		}
		return preco;
	}
}
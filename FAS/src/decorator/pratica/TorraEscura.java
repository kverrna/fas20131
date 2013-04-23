package decorator.pratica;
public class TorraEscura extends Bebida {

	public TorraEscura(Tamanhos tamanho) {
		super.setTamanho(tamanho);
	}
	
	@Override
	public String getDescricao() {
		return "Cafe Torra Escura";
	}

	@Override
	public double preco() {
		double preco = 0;
		if (super.getTamanho() == Tamanhos.PEQUENO) {
			preco = 2.63;
		} else if (super.getTamanho() == Tamanhos.MEDIO) {
			preco = 4.03;
		} else if (super.getTamanho() == Tamanhos.GRANDE) {
			preco = 5.25;
		}
		return preco;
	}

}

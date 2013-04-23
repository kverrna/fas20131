package decorator.pratica;
public class Leite extends CondimentosDecorator {
	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Leite";
	}

	/**
		 */
	public Leite(Bebida bebida) {
		this.bebidaWrapped = bebida;
	}

	public Tamanhos getTamanho(){
		return bebidaWrapped.getTamanho();
	}

	@Override
	public double preco() {
		double preco = bebidaWrapped.preco(); 
		if (this.getTamanho() == Tamanhos.PEQUENO) {
			preco += 0.5;
		} else if (this.getTamanho() == Tamanhos.MEDIO) {
			preco += 0.63;
		} else if (this.getTamanho() == Tamanhos.GRANDE) {
			preco += 1.25;
		}
		return preco;
	}
}

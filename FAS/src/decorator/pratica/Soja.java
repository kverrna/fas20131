package decorator.pratica;
public class Soja extends CondimentosDecorator {

	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Soja";
	}

	/**
		 */
	public Soja(Bebida bebida) {
		this.bebidaWrapped = bebida;
	}

	public Tamanhos getTamanho(){
		return bebidaWrapped.getTamanho();
	}

	@Override
	public double preco() {
		double preco = bebidaWrapped.preco(); 
		if (this.getTamanho() == Tamanhos.PEQUENO) {
			preco += 0.8;
		} else if (this.getTamanho() == Tamanhos.MEDIO) {
			preco += 0.1;
		} else if (this.getTamanho() == Tamanhos.GRANDE) {
			preco += 2.0;
		}
		return preco;
	}

}

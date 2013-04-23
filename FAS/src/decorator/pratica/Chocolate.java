package decorator.pratica;

public class Chocolate extends CondimentosDecorator {

	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Chocolate";
	}

	/**
		 */
	public Chocolate(Bebida bebida) {
		this.bebidaWrapped = bebida;
	}
	
	public Tamanhos getTamanho(){
		return bebidaWrapped.getTamanho();
	}

	@Override
	public double preco() {
		double preco = bebidaWrapped.preco(); 
		if (this.getTamanho() == Tamanhos.PEQUENO) {
			preco += 0.6;
		} else if (this.getTamanho() == Tamanhos.MEDIO) {
			preco += 0.75;
		} else if (this.getTamanho() == Tamanhos.GRANDE) {
			preco += 1.5;
		}
		return preco;
	}

}

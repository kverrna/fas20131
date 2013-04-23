package decorator.pratica;

public class Chantilly extends CondimentosDecorator {

	Bebida bebidaWrapped;

	@Override
	public String getDescricao() {
		return this.bebidaWrapped.getDescricao() + ", Chantilly";
	}

	public Tamanhos getTamanho(){
		return bebidaWrapped.getTamanho();
	}
	
	@Override
	public double preco() {
		double preco = bebidaWrapped.preco(); 
		if (this.getTamanho() == Tamanhos.PEQUENO) {
			preco += 0.3;
		} else if (this.getTamanho() == Tamanhos.MEDIO) {
			preco += 0.38;
		} else if (this.getTamanho() == Tamanhos.GRANDE) {
			preco += 0.75;
		}
		return preco;
		
	}

	/**
		 */
	public Chantilly(Bebida bebidaWrapped) {
		this.bebidaWrapped = bebidaWrapped;
	}

}

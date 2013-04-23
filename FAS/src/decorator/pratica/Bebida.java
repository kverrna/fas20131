package decorator.pratica;
public abstract class Bebida {

	private String descricao;
	
	protected static enum Tamanhos{PEQUENO, MEDIO, GRANDE};
	
	private Tamanhos Tamanho;
	
	public abstract String getDescricao();

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public abstract double preco();

	public Tamanhos getTamanho() {
		return Tamanho;
	}

	public void setTamanho(Tamanhos tamanho) {
		Tamanho = tamanho;
	}
}

package decorator.tape3;



public abstract class Bebida {

	private String descricao;

	
	public abstract String getDescricao() ;

	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
		public abstract float preco();
	
	}

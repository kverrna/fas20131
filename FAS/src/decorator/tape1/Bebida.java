package decorator.tape1;


public abstract class Bebida {

	float valorLeite = 0.15f;
	float valorChocolate = 0.25f;
	float valorSoja = 0.20f;
	float valorChantilly = 0.50f;
	
	private String descricao;

	
	public String getDescricao() {
		return descricao;
	}

	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

		
	
		public float preco(){
			float valorCondimento = 0.0f;
			if (hasLeite()){
				valorCondimento+= valorLeite;
			}
			if (hasChocolate()){
				valorCondimento+= valorChocolate;
			}
			
			if (hasSoja()){
				valorCondimento+= valorSoja;
			}
			
			if (hasChantilly()){
				valorCondimento+= valorChantilly;
			}
			
			return valorCondimento;
		};
	
		private boolean milk;

	
		public boolean hasMilk() {
			return milk;
		}

		public void setMilk(boolean milk) {
			this.milk = milk;
		}

		private boolean chocolate;
		public boolean hasChocolate() {
			return chocolate;
		}


		public void setChocolate(boolean chocolate) {
			this.chocolate = chocolate;
		}

		
	
		private boolean leite;

	
		public boolean hasLeite() {
			return leite;
		}


		public void setLeite(boolean leite) {
			this.leite = leite;
		}


		
		private boolean chantilly;




		
		private boolean soja;

	
		public boolean hasSoja() {
			return soja;
		}

	
		public void setSoja(boolean soja) {
			this.soja = soja;
		}
		
	
		public boolean hasChantilly() {
			return chantilly;
		}

	
		public void setChantilly(boolean chantilly) {
			this.chantilly = chantilly;
		}

}

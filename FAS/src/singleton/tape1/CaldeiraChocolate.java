package singleton.tape1;

public class CaldeiraChocolate {

	private boolean vazia;
	private boolean fervido;
	private static CaldeiraChocolate unicaInstancia = null;
	
	private CaldeiraChocolate() {
		vazia = true;
		fervido = false;
	}
	
	public CaldeiraChocolate getInstance(){
		if (unicaInstancia == null){
			unicaInstancia = new CaldeiraChocolate();
		}
		return unicaInstancia;
	}

	public void encher() {
		if (estaVazia()) {
			vazia = false;
			fervido = false;
			// Enche a Caldeira com a mistura de chocolate e leite.
		}
	}

	public void drenar() {
		if (!estaVazia() && estaFervido()) {
			// drena a fervura de leite e chocolate.
			vazia = true;
		}
	}

	public void ferver() {
		if (!estaVazia() && !estaFervido()) {
			// ferver o conteúdo da caldeira
			fervido = true;
		}
	}

	public boolean estaVazia() {
		return vazia;
	}

	public boolean estaFervido() {
		return fervido;
	}
}
package singleton.tape2;

public class CaldeiraChocolate {

	private boolean vazia;
	private boolean fervido;

	public CaldeiraChocolate() {
		vazia = true;
		fervido = false;
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
			// ferver o conte�do da caldeira
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
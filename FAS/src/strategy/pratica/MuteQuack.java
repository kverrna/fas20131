package strategy.pratica;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}

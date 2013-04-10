package strategy.pratica;

public class DabblingDuck implements FeedBehavior {

	@Override
	public void feed() {
		System.out.println("Eating from the surface");
	}
}

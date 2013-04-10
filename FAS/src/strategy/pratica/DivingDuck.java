package strategy.pratica;

public class DivingDuck  implements FeedBehavior {

	@Override
	public void feed() {
		System.out.println("Diving to eat");
	}
}


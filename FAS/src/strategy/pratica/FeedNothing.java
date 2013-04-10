package strategy.pratica;

public class FeedNothing  implements FeedBehavior {

	@Override
	public void feed() {
		System.out.println("I dont eat");
	}
}

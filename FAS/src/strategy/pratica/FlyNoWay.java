package strategy.pratica;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying");	
	}
}

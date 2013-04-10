package strategy.pratica;

public class RubberDuck extends Duck {

	public RubberDuck(){
		quackbehavior = new Quack();
		flybehavior = new FlyNoWay();
		feedbehavior = new FeedNothing();
	}
	
	@Override 
	public void display(){
		
		System.out.println("I'm a real Rubber Duck");
	}
}
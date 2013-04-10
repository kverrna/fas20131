package strategy.pratica;

public class Duck {
	
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	FeedBehavior feedbehavior;

	public void swimm() {
		System.out.println("Swimming");
	}

	public void display() {
	}
	
	public void performaQuack(){
		quackbehavior.quack();
	}
	
	public void performFly(){
		flybehavior.fly();
	}
	
	public void performFeed(){
		feedbehavior.feed();
	}
}
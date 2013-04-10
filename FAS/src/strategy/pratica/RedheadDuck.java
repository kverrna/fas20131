package strategy.pratica;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
		feedbehavior = new DabblingDuck();
	}
	
	@Override 
	public void display(){
		System.out.println("I'm a real Redhead Duck");
	}		
}
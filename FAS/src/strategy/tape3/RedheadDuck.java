package strategy.tape3;

public class RedheadDuck extends Duck {
	
	public RedheadDuck(){
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
	}
	
	
	@Override 
	public void display(){
		System.out.println("I'm a real Redhead Duck");
	}
	
}
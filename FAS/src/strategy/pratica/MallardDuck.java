package strategy.pratica;

public class MallardDuck extends Duck  {
	
	public MallardDuck(){
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
		feedbehavior = new DivingDuck();
	}
	
	@Override 
	public void display(){
		System.out.println("I'm a real Mallard Duck");
	}
}

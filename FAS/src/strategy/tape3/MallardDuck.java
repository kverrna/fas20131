package strategy.tape3;

public class MallardDuck extends Duck  {
	
	public MallardDuck(){
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
	}
	
	@Override 
	public void display(){
		
		System.out.println("I'm a real Mallard Duck");
		
	}
		
}

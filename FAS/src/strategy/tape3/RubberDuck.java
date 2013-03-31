package strategy.tape3;

public class RubberDuck extends Duck {

	public RubberDuck(){
		quackbehavior = new Quack();
	}
	
	@Override 
	public void display(){
		
		System.out.println("I'm a real Rubber Duck");
	}
	

}

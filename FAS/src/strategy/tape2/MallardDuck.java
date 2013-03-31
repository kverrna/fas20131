package strategy.tape2;

public class MallardDuck extends Duck implements Flyable, Quackable {
	
	@Override 
	public void display(){
		
		System.out.println("Mallard Duck");
		
	}
	
	public void quack() {
		System.out.println("Quak quak");
	}
	
	public void fly(){
		System.out.println("Flying");
		
	}

}

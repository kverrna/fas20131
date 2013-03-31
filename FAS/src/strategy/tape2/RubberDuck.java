package strategy.tape2;

public class RubberDuck extends Duck implements Quackable {
	
	@Override 
	public void display(){
		
		System.out.println("Rubber Duck");
	}
	
	public void quack() {
		System.out.println("Quak quak");
	}

}

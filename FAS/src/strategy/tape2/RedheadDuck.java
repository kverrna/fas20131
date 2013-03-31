package strategy.tape2;

public class RedheadDuck extends Duck implements Flyable, Quackable {
	
	@Override 
	public void display(){
		System.out.println("Redhead Duck");
	}
	
	public void quack() {
		System.out.println("Quak quak");
	}
	
	public void fly(){
		System.out.println("Flying");

}
}
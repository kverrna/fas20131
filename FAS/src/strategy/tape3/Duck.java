package strategy.tape3;

/**
 * @author  fabricio.braz
 */
public class Duck {
	
	/**
	 * @uml.property  name="flybehavior"
	 * @uml.associationEnd  
	 */
	FlyBehavior flybehavior;
	/**
	 * @uml.property  name="quackbehavior"
	 * @uml.associationEnd  
	 */
	QuackBehavior quackbehavior;

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
}

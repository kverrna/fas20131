package strategy.tape3;

public class Simduck {
	
	public static void main(String[] args){
		MallardDuck mallard = new MallardDuck();
		RedheadDuck redread = new RedheadDuck();
		RubberDuck rubberduck = new RubberDuck();
		
		mallard.display();
		mallard.performaQuack();
		mallard.swimm();
		mallard.performFly();
				
		redread.display();
		redread.performaQuack();
		redread.swimm();
		redread.performFly();
		
		rubberduck.display();
		redread.performaQuack();
		rubberduck.swimm();	
		
	}

}

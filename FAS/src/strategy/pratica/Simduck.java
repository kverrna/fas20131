package strategy.pratica;

public class Simduck {
	
	public static void main(String[] args){
	
		RedheadDuck redread = new RedheadDuck();
		RubberDuck rubberduck = new RubberDuck();
		MallardDuck mallard = new MallardDuck();
		
		mallard.display();
		mallard.performaQuack();
		mallard.swimm();
		mallard.performFly();
		mallard.performFeed();
				
		redread.display();
		redread.performaQuack();
		redread.swimm();
		redread.performFly();
		redread.performFeed();
		
		rubberduck.display();
		redread.performaQuack();
		rubberduck.swimm();	
		rubberduck.performFeed();	
	}
}

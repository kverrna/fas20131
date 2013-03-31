package strategy.tape1;

public class Simduck {
	
	public static void main(String[] args){
		MallardDuck mallard = new MallardDuck();
		RedheadDuck redread = new RedheadDuck();
		RubberDuck rubberduck = new RubberDuck();
		
		mallard.display();
		mallard.quack();
		mallard.swimm();
		mallard.fly();
		
		
		redread.display();
		redread.quack();
		redread.swimm();
		redread.fly();
		
		rubberduck.display();
		rubberduck.quack();
		rubberduck.swimm();
		rubberduck.fly();
		
		
	}

}

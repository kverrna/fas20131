package strategy.pratica;

public class Simduck {
	
	public static void main(String[] args){
	
		RedheadDuck redread = new Simduck().new RedheadDuck();
		RubberDuck rubberduck = new Simduck().new RubberDuck();
		MallardDuck mallard = new Simduck().new MallardDuck();
		
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
	
	public class Quack implements QuackBehavior {

		@Override
		public void quack() {
			System.out.println("Quak quak");
		}
	}

	
	public interface QuackBehavior {
		abstract void quack();
	}

	
	public class Squeak implements QuackBehavior {

		@Override
		public void quack() {
			System.out.println("quiet");

		}

	}
	
	public class Duck {
		
		FlyBehavior flybehavior;
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
	
	public class MuteQuack implements QuackBehavior {

		@Override
		public void quack() {
			System.out.println("Squeak");
		}
	}
	
	public class RubberDuck extends Duck {

		public RubberDuck(){
			quackbehavior = new Quack();
		}
		
		@Override 
		public void display(){
			
			System.out.println("I'm a real Rubber Duck");
		}
	}

	
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
	
	public class RedheadDuck extends Duck {
		public RedheadDuck(){
			quackbehavior = new Quack();
			flybehavior = new FlyWithWings();
		}
		
		@Override 
		public void display(){
			System.out.println("I'm a real Redhead Duck");
		}		
	}
	
	public class DecoyDuck extends Duck {
		@Override 
		public void display(){
			
			System.out.println("I'm a real Decoy Duck");	
		}
	}
	
	public interface FlyBehavior {
		abstract void fly();
	}
	
	public class FlyWithWings implements FlyBehavior {
		@Override
		public void fly() {
			System.out.println("Cannot fly");	
		}
	}
	
	public class FlyNoWay implements FlyBehavior {

		@Override
		public void fly() {
			System.out.println("Flying");	
		}
	}
}

package strategy.pratica.innerclasses;

public class Simduck {
	
	public static void main(String[] args){
	
		RedheadDuck redread = new Simduck().new RedheadDuck();
		RubberDuck rubberduck = new Simduck().new RubberDuck();
		MallardDuck mallard = new Simduck().new MallardDuck();
		
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
		FeedBehavior feedbehavior;

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
		
		public void performFeed(){
			feedbehavior.feed();
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
			flybehavior = new FlyNoWay();
			feedbehavior = new FeedNothing();
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
			feedbehavior = new DivingDuck();
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
			feedbehavior = new DabblingDuck();
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
	
	public class DabblingDuck implements FeedBehavior {

		@Override
		public void feed() {
			System.out.println("Eating from the surface");
		}
	}

	
	public interface FeedBehavior {
		abstract void feed();
	}

	public class DivingDuck  implements FeedBehavior {

		@Override
		public void feed() {
			System.out.println("Diving to eat");
		}
	}
	
	public class FeedNothing  implements FeedBehavior {

		@Override
		public void feed() {
			System.out.println("I dont eat");
		}
	}
}

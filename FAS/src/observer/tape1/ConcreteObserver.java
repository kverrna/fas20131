package observer.tape1;

public class ConcreteObserver implements Observer {
	
	public ConcreteObserver(Subject concreteSubject){
		
	}

	public void display() {
		System.out.println("Info");
		
	}

	@Override
	public void update() {
	
		display();
	}
}

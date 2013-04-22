package decorator.tape2;



public class ConcreteDecoratorA extends Decorator {
	
	Component wrappedObj;

	@Override
	public void methodA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub

	}

		
		/**
		 */
		public ConcreteDecoratorA(Component component){
			this.component = component;
		}

}

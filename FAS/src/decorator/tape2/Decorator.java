package decorator.tape2;


public abstract class Decorator extends Component {
	
	Component component;

	@Override
	public abstract void methodA() ;
	
	@Override
	public abstract void methodB() ;
}

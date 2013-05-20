package command.tape2;


public class Client {
	public static void main(String[] args) {
	Receiver receiver = new Receiver();
	ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
	}
}

package abstraction;

public interface Car {

	public abstract void start(); //method declared in a interface but can't be implemented
	public void stop(); // we can write abstract inside the method or not.
	public void brake();
}

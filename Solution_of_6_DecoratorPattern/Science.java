package Solution_of_6_DecoratorPattern;

public class Science extends Decorator {
	 
	private Girl girl;
 
	public Science(Girl g) {
		girl = g;
	}
 
	@Override
	public String getDescription() {
		return girl.getDescription() + "+Like Science";
	}
 
	public void caltulateStuff() {
		System.out.println("scientific calculation!");
	}
}

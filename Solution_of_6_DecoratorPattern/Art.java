package Solution_of_6_DecoratorPattern;

public class Art extends Decorator {
	 
	private Girl girl;
 
	public Art(Girl g) {
		girl = g;
	}
 
	@Override
	public String getDescription() {
		return girl.getDescription() + "+Like Art";
	}
 
	public void draw() {
		System.out.println("draw pictures!");
	}
}

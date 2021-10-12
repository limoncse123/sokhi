package Solution_of_6_DecoratorPattern;

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl g1 = new AmericanGirl();
		System.out.println(g1.getDescription());
 
		Science g2 = new Science(g1);
		System.out.println(g2.getDescription());
 
		Art g3 = new Art(g2);
		System.out.println(g3.getDescription());
	}

}

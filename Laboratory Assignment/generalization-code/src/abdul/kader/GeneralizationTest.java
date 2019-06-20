package abdul.kader;

public class GeneralizationTest {
	
	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Abdul";
		
		System.out.println(a);
		
		Customer c = new Customer("Kader", "Dhaka");
		System.out.println(c);
	}
}

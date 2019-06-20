package abdul.kader;

public class Main {
	
	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Abdul";
		
		System.out.println(a);
		
		Address address1=new Address("Dhaka", "Dhaka", "Bangladesh");
		Customer c = new Customer("Kader", address1);

		System.out.println(c);
	}
}

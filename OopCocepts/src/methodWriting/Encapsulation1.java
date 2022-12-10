package methodWriting;
import java.util.Scanner;

public class Encapsulation1 {
	public static void getDetails() {
	System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
	System.out.println("Enter the MobileNo");
		long MobileNo = sc.nextLong();
	System.out.println("Enter the City");
		String City = sc.next();
	System.out.println("Enter the Country");
		String Country = sc.next();
		
		Encapsulation encap = new Encapsulation();
		encap.setName(Name);
		encap.setMobileNo(MobileNo);
		encap.setCity(City);
		encap.setCountry(Country);
		
		System.out.println("Name :"+encap.getName());
		System.out.println("MobileNo :"+encap.getMobileNo());
		System.out.println("City : "+encap.getCity());
		System.out.println("Country :"+encap.getCountry());
		
	}
	public static void main(String[] args) {
		getDetails();
	}

}

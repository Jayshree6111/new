package methodWriting;

public class Overloadding {
	int Roll;
	String Name;
	
	public Overloadding(int roll) {
		Roll = roll;
		System.out.println(Roll);
		
		
	}
	public Overloadding(String name ) {
		Name=name;
		
		
		
	}

	public static void main(String[] args) {
		Overloadding over = new Overloadding( 12);
		Overloadding over1 = new Overloadding( "Jayshree");
		
		
		
	}
	
}
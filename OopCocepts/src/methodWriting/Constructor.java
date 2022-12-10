package methodWriting;

public class Constructor {
	int RollNo;
	String Name;
	int Id;
		
public	Constructor(int RollNo, String Name, int Id) {
	RollNo = RollNo;
	Name = Name;
	Id = Id;
	System.out.println("Rollno of student is " +RollNo);
	System.out.println("Name of student is " +Name);
	System.out.println("Id of student is " +Id);
	
		
	}
public static void main(String[] args) {
	Constructor con = new Constructor(120,"Jayshree",119);
}

}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WorkingWithFiles {

	ArrayList<Person> personList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		WorkingWithFiles workingWithFiles = new WorkingWithFiles();
		
		BufferedWriter bWrite;
		FileWriter fWrite;
 	
		
			
		Person john = new Person("John", 33, "Developer");
		Person david = new Person("David", 27, "Tester");
		Person joe = new Person("Joe", 30, "Engineer");
		Person bob = new Person("Bob", 36, "Musician");
		Person lee = new Person("Lee", 37, "Martial Artist");
		
		workingWithFiles.personList.add(bob);
		workingWithFiles.personList.add(john);
		workingWithFiles.personList.add(joe);
		workingWithFiles.personList.add(david);
		workingWithFiles.personList.add(lee);
			
		
		System.out.println("Printing out Person List");
		for (Person person : workingWithFiles.personList) {
			System.out.println(person.toString());
		}
		
		System.out.println("Wrting Values to File!");
		
		for(Person person : workingWithFiles.personList) {
			
		}
	
	}

}

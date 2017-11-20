import java.util.ArrayList;

public class ExamplePerson {

	ArrayList<Person> personList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		PersonManager personManager = new PersonManager();
		
		Person john = new Person("John", 33, "Developer");
		Person david = new Person("David", 27, "Tester");
		Person joe = new Person("Joe", 30, "Engineer");
		Person bob = new Person("Bob", 36, "Musician");
	
		personManager.personList.add(john);
		personManager.personList.add(david);
		personManager.personList.add(joe);
		personManager.personList.add(bob);
		
		
		System.out.println("Printing out Person List");
		for (Person person : personManager.personList) {
			System.out.println(person.toString());
		}
		
		System.out.println("\nTesting for person Joe");
		System.out.println(personManager.searchList("Joe"));
	}
	
	public String searchList(String name) {
		for (Person person : personList) {
			if (name.equals(name)) {
				return (name + " Does exist. Details are below\n" + 
						person.toString());
			}
		}
		return "Person does NOT exist";
	}
	
	
}

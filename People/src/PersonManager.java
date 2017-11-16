import java.util.ArrayList;

public class PersonManager {

	protected ArrayList<Person> personList = new ArrayList<>();
	
	public String searchList(String name) {
		for (Person person : personList) {
			if (name.equals(name)) {
				return (name + " Does exist. Details are below\n" + person.toString());
			}
		}
		return "Person does NOT exist";
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class PeopleTest {
	
	PersonManager personManager = new PersonManager();
	
	String name = "Khem";
	int age = 23;
	String jobTitle = "Trainee";
	
	
	@Test
	public void test() {
	
		Person testPerson = new Person(name, age, jobTitle);	
		personManager.personList.add(testPerson);
	
		assertEquals(personManager.searchList(name), name);
		assertEquals(personManager.searchList(jobTitle), jobTitle);
	}

}

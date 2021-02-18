package objects;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Person> people = new ArrayList<>();
	
	public void addPerson(Person person) {
		this.people.add(person);
	}
	
	public void removePerson(Person person) {
		this.people.remove(person);
	}
	
	public Person findName(String name) {
		for (Person person : people) {
			return person;
		}	
	
	System.out.println("Not found");
	return null;
	}

}	
	
	
	
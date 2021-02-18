package objects;

import java.util.ArrayList;

public class Runner {
	
		public static void main(String[] args) {
			Person p1 = null;
	    	p1 = new Person("Karen", "management liason", 40);
	    	Person p2 = new Person("Dave", "builder", 37);
	    	Person p3 = new Person("Stacey", "chav", 22);
	    	Person p4 = new Person("River", "student at the University of Life", 66);
	    	
	    	Manager manager = new Manager();
		    	manager.addPerson(p1);
		    	manager.addPerson(p2);
		    	manager.addPerson(p3);
		    	manager.addPerson(p4);
	    	
	    	Person found = manager.findName("Karen");
	    		found.print();

		}
}
	
	


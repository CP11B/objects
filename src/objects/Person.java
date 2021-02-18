package objects;


public class Person {
		
	    public String name;
	    public String job;
	    public int age;
	     

	    public Person(String name, String job, int age) {
	    	this.name = name;
	    	this.job = job;
	    	this.age = age;
	    }
	
	    
    	public String getName() {
    		return name;    		
    	}
    	
    	public void setName(String name) {
    		this.name = name;    		
    	}
    	
    	
    	public String getJob() {
    		return job;
    	}
    	
    	public void setJob(String job) {
    		this.job = job;
    	}
    	
  	
    	
    	public int getAge() {
    		return age;
    	}
    	
    	public void setAge(int age) {
    		if (age >= 0 && age < 130) {
    			this.age = age;
    		} else {
    			System.out.println("Don't be silly- no one is that wizened...");
    		}
    	}
    	
    	public void print() {
    		String format = this.name + " is a " + this.job + " and is " + this.age;
    		System.out.println(format);
    	}   		    
}
	
//Create a Person class modelling name, age and job title variables.
//Create some example objects with this class.

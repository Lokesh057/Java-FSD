package practice.com;

public class ConstructorTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Person person1 = new Person();
	        Person person2 = new Person("Jain",24 ); 
	        Person person3 = new Person(person2); 

	        System.out.println("Person 1: " + person1);
	        System.out.println("Person 2: " + person2);
	        System.out.println("Person 3: " + person3);
	    }
	}

	class Person {
	    private String name;
	    private int age;

	    public Person() {
	        this.name = "Lokesh";
	        this.age = 23;
	    }

	    public Person (String name, int age) {
	        this.name = name;
	        this.age = 22;
	    }

	    public Person(Person otherPerson) {
	        this.name = otherPerson.name;
	        this.age = otherPerson.age;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	}

}

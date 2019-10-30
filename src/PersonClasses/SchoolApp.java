package PersonClasses;

public class SchoolApp {

	public static void main(String[] args) {
		
		Person person = new Person("Ben", "1234 street avenue");
		System.out.println(person);
		
		Student student = new Student("Matt", "4321 avenue street", "Human Rights", 20019, 100000002100.99);
		System.out.println(student);
		
		Staff staff = new Staff("Kyle", "721 Porter lane", "Grand Circus", 4000.00);
		System.out.println(staff);

	}

}

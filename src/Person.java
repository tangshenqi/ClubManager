
public class Person {
	
	private String surname;
	private String firstName;
	private String secondName;
	
	public Person(String surname, String firstName, String secondName)
	{
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public Person(String surname, String firstName)
	{
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = null;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public void show() {
		System.out.println(this);
	}
	
	public String toString() {
		String person;
		if (secondName == null)
		{
			person = surname + " " + firstName;
		}
		else
		{
			person = surname + " " + firstName + " " + secondName;
		}
		return person;
	}

}

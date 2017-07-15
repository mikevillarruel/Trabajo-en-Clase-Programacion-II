package Excel;

public abstract class Person {
	private int id;
	private String name;
	private String birthday;
	
	public Person(int id, String name, String birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	public abstract void save(Person[] datos);	
	
	

	
	
}

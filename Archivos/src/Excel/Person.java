package Excel;
/**
 * 
 * @authors: Michael Villarruel
 *          Kevin Quiroga
 *          John Ponce
 */
public abstract class Person {
	private int id;
	private String name;
	private String birthday;
	/**
	 * @param id
	 * @param name
	 * @param birthday
	 */
	public Person(int id, String name, String birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return bithday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	public abstract void save(Person[] datos);	
	
	

	
	
}

package Excel;

public class Employee extends Person {
	
	private float salary;
	
	public Employee(int id, String name, String birthday, int salary) {
		super(id, name, birthday);
		this.salary=salary;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return getId()+";"+getName()+";"+getBirthday()+";"+Float.toString(salary);
	}
	
	public void save(Person[] empleado){
		FileManager guardar = new FileManager();
		for(int i=0;i<3;i++){
		guardar.save("Employee",empleado[i].toString());
	
		}
	}

}

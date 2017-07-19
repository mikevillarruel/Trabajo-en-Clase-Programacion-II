package Excel;

public class Employee extends Person {
	
	private float salary;
	/**
	 * Se envian todos los datos del empleado
	 * @param id
	 * @param name
	 * @param birthday
	 * @param salary
	 */
	public Employee(int id, String name, String birthday, int salary) {
		super(id, name, birthday);
		this.salary=salary;
	}
	/**
	 * 
	 * @return
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * 
	 * @param salary
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return getId()+";"+getName()+";"+getBirthday()+";"+Float.toString(salary);
	}
	/**
	 * Se envia como parametro un arreglo que contiene los datos ingresados
	 */
	public void save(Person[] empleado){
		FileManager guardar = new FileManager();
		for(int i=0;i<3;i++){
		guardar.save("Employee",empleado[i].toString());
	
		}
	}

}

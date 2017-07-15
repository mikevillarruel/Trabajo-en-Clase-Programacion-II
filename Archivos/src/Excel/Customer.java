package Excel;

public class Customer extends Person{

	private String address;
	
	public Customer(int id, String name, String birthday, String address) {
		super(id, name, birthday);
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return getId()+";"+getName()+";"+getBirthday()+";"+address;
	}
	
	public void save(Person[] cliente){
		FileManager guardar = new FileManager();
		for(int i=0;i<3;i++){
		guardar.save("Customer",cliente[i].toString());
	
		}
	}
}

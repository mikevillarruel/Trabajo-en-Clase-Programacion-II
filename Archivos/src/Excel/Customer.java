package Excel;

public class Customer extends Person{

	private String address;
	/**
	 * Se envian todos los datos del cliente
	 * @param id
	 * @param name
	 * @param birthday
	 * @param address
	 */
	public Customer(int id, String name, String birthday, String address) {
		super(id, name, birthday);
		this.address=address;
	}
	/**
	 * 
	 * @return Customer's Address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 
	 */
	public String toString() {
		return getId()+";"+getName()+";"+getBirthday()+";"+address;
	}
	/**
	 * Se envia como parametro un arreglo que contiene los datos ingresados
	 */
	public void save(Person[] cliente){
		FileManager guardar = new FileManager();
		for(int i=0;i<3;i++){
		guardar.save("Customer",cliente[i].toString());
	
		}
	}
}

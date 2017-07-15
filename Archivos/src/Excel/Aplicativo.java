package Excel;

public class Aplicativo {
	public static void main(String[] args){
		FileManager buscar = new FileManager();
		Employee[] empleado = new Employee[3];
		empleado[0]=new Employee(14497,"Jose","12/08/90",12);
		empleado[1]=new Employee(14897,"Juan","15/04/89",148);
		empleado[2]=new Employee(15497,"Ana","19/09/90",1000);
		
		Customer[] cliente = new Customer[3];
		cliente[0]=new Customer(14497,"Jose","12/08/90","Quito, Av Patria");
		cliente[1]=new Customer(14897,"Juan","15/04/89","Ibarra, Av Simon Bolivar");
		cliente[2]=new Customer(15497,"Ana","19/09/90","Sangolqui, Av Rumiñahui");
		
		empleado[0].save(empleado);
		cliente[0].save(cliente);
		System.out.println("El cliente buscado es:");
		buscar.find(14897,"Customer");
		
	}

}

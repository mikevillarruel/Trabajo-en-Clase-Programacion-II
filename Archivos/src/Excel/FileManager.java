package Excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	private String texto="";
	/**
	 * 
	 * @param table = Contiene el nombre del archivo en el que se guardara la informacion
	 * @param data = Contiene los datos que seran guardados en el archivo
	 */
	public void save(String table, String data){
		
		String nombreArchivo = table+".csv";
        boolean alreadyExists = new File(nombreArchivo).exists();
         
        if(alreadyExists){
            File ficheroUsuarios = new File(nombreArchivo);
            ficheroUsuarios.delete();
        } /*else{
        	texto="";
        }    */    
    	texto += data+"\n";
    	        
    	        try{
    	            FileWriter fwriter = new FileWriter(nombreArchivo);
    	            //fwriter.write('\ufeff'); //si no se escribe esto, excel no muestra bien el texto con tildes
    	            fwriter.write(texto);
    	            fwriter.flush();
    	            fwriter.close();
    	        }catch (IOException e){
    	            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
    	        }
        
		
	}
	/**
	 * 
	 * @param id = Contiene el dato que se buscara
	 * @param archivo = Contiene el nombre del archivo en el que se realizara la busqueda
	 */
	public void find(int id,String archivo){
		
		BufferedReader br = null;
	     
	     try {
	        
	        br =new BufferedReader(new FileReader(archivo+".csv"));
	        String line = br.readLine();
	        while (null!=line) {
	           String [] fields = line.split(SEPARATOR);
	           if(line.contains(Integer.toString(id)))
	        	   System.out.println(Arrays.toString(fields));
	           //System.out.println(Arrays.toString(fields));
	           
	           line = br.readLine();
	        }
	        
	     } catch (Exception e) {
	   	  //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
	     } finally {
	        if (null!=br) {
	           //br.close();
	        }
	     }
		
		
	}
}

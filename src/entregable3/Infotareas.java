package entregable3;
import java.io.FileWriter;
import java.io.PrintWriter;
import entregable3.*;
import java.util.Scanner;
public class Infotareas {
	private Tareas [] Tareas;
	
	public static void añadirtareas() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Escribir una nueva Tarea:");
		String tarea = sc.nextLine();
		try {
			FileWriter documento = new FileWriter  ("C:\\Users\\Carmen\\eclipse-workspace\\entregable3\\src\\entregable3\\Calendario.txt");
			PrintWriter pw = new PrintWriter (documento);
			String Linea = tarea+"_"+ fecha.CrearFecha() + "_" + "false";
			pw.println(tarea);
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

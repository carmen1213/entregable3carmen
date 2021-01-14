package entregable3;

import java.io.*;
import entregable3.*;
import java.util.Date;
import java.util.Scanner;

public class tarea {

	static Tareas tasks[] = new Tareas[50];
	static int noTareas = 0;

	public static void main(String[] args) {

		boolean salir = false;
		leerArchivo();
		while (salir = true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("Elige una opcion");
			System.out.println("");
			System.out.println("1-Crear una nueva Tarea");
			System.out.println("2- Ver tareas");
			System.out.println("3-Completar tareas pendientes");
			System.out.println("4- Salir");

			int a = sc.nextInt();

			switch (a) {
			case 1:
				crearTarea();
				break;
			case 2:
				leerTareas();
				break;
			case 3:
				completarTareas();
				break;
			case 4:
				System.out.println("Has decidido Salir.");
				guardarArchivo();
				salir = false;
				return;
			default:
				System.out.println("El numero introducido no corresponde a ningun valor correcto");
				return;
			}
		}
	}

	private static void leerArchivo() {
		try {
			FileReader myObject = new FileReader("C:\\Users\\Carmen\\eclipse-workspace\\entregable3\\src\\entregable3\\Calendario");
			Scanner myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String titulo = data.split("_")[0];
				Date date = fecha.leerFecha(data.split("_")[1]);
				boolean estado = Boolean.parseBoolean(data.split("_")[2]);
				tasks[noTareas++] = new Tareas(date, titulo, estado);
				System.out.println(tasks[noTareas - 1]);
			}

		} catch (Exception e) {
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();
		}
	}
	
	private static void guardarArchivo() {
		try {
			FileWriter documento = new FileWriter  ("C:\\Users\\Carmen\\eclipse-workspace\\entregable3\\src\\entregable3\\Calendario");
			PrintWriter pw = new PrintWriter (documento);
			for (int i = 0; i < noTareas; i++) {
				String Linea = tasks[i].getTitulo() + "_" + fecha.CrearFecha(tasks[i].getFecha()) + "_" + tasks[i].getEstado();
				pw.println(Linea);
			}
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();
		}
	}

	private static void crearTarea() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Escribir una nueva Tarea:");
		String tarea = sc.nextLine();
		tasks[noTareas++] = new Tareas(new Date(), tarea, false);
	}
	
	private static void leerTareas() {
		System.out.println("Tareas Pendientes");
		for (int i = 0; i < noTareas; i++) {
			if (tasks[i].getEstado() == false) {
				System.out.println(tasks[i]);
			}
		}
		System.out.println("Tareas Completadas");
		for (int i = 0; i < noTareas; i++) {
			if (tasks[i].getEstado() == true) {
				System.out.println(tasks[i]);
			}
		}
	
	}
	private static void completarTareas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el titulo de la tarea que quieras completar:");
		String tareaACompletar = sc.nextLine();
		for (int i = 0; i < noTareas; i++) {
			if(tasks[i].getTitulo().equals(tareaACompletar)) {
				tasks[i].setEstado(true);
			}
		}
		

	}
}

package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner leer = new Scanner(System.in);

	static List<String> estudiantes = new ArrayList<>();
	static List<Double> calificaciones = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	static void menu() {
		int opcion = 0;
		do {
			try {
				System.out.println("Bienvenido al sistema de gestión de estudiantes.");
				System.out.println("1. Agregar estudiante");
				System.out.println("2. Mostrar lista de estudiantes");
				System.out.println("3. Calcular promedio de calificaciones");
				System.out.println("4. Mostrar estudiante con la calificación más alta");
				System.out.println("5. Salir");
				System.out.print("Seleccione una opción (1 - 5): ");

				opcion = Integer.parseInt(leer.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten numeros del 1 al 5, intente de nuevo");
				System.out.println("\n");
				menu();
			}
		} while (opcion < 1 || opcion > 5);
		switch (opcion) {
		case 1:
			agregarEstudiantes();
			break;
		case 2:
			listaEstudiantes();
			break;
		case 3:
			calcularPromedio();
			break;
		case 4:
			mostrarEstudianteCalificacionMasAlta();
			break;
		case 5:
			System.out.println("Saliendo del programa...");
			System.exit(0);
			break;
		}
	}

	static void agregarEstudiantes() {
		double calificacion = 0;
		System.out.println("\n");
		System.out.print("Ingrese el nombre del estudiante: ");
		String nombre = leer.nextLine();

		if (nombre.length() >= 3 && nombre.matches("[ a-zA-Z áéíóúÁÉÍÓÚñÑ ]+")) {

		} else {
			System.out.println("ERROR... El nombre debe ser real, intente de nuevo");
			agregarEstudiantes();
		}
		do {
			try {

				System.out.print("Ingrese la calificación del estudiante (0 - 100): ");
				calificacion = Double.parseDouble(leer.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos, intente de nuevo");
				menu();
			}
		} while (calificacion <= 0 || calificacion > 100);

		estudiantes.add(nombre);
		calificaciones.add(calificacion);

		System.out.println("Estudiante agregado correctamente.");
		System.out.println("\n");
		menu();
	}

	static void listaEstudiantes() {

		if (estudiantes.isEmpty()) {
			System.out.println("\n");
			System.out.println("No hay estudiantes registrados.");
			System.out.println("\n");
			menu();
		} else {
			System.out.println("\n");
			System.out.println("---- Lista de estudiantes ----");
			for (int i = 0; i < estudiantes.size(); i++) {
				System.out.println(estudiantes.get(i) + " - Calificación: " + calificaciones.get(i));
			}
			System.out.println("\n");
			menu();
		}

	}

	static void calcularPromedio() {
		if (calificaciones.isEmpty()) {
			System.out.println("\n");
			System.out.println("No hay calificaciones registradas.");
			System.out.println("\n");
			menu();
		} else {
			double suma = 0;

			for (double calificacion : calificaciones) {
				suma += calificacion;
			}

			double promedio = suma / calificaciones.size();
			System.out.println("\n");
			System.out.println("El promedio de calificaciones es: " + promedio);
		}
		System.out.println("\n");
		menu();
	}

	static void mostrarEstudianteCalificacionMasAlta() {
		if (calificaciones.isEmpty()) {
			System.out.println("\n");
			System.out.println("No hay calificaciones registradas.");
			System.out.println("\n");
			menu();
		} else {

			double maxCalificacion = calificaciones.get(0);
			String estudianteMax = estudiantes.get(0);

			for (int i = 1; i < calificaciones.size(); i++) {
				if (calificaciones.get(i) > maxCalificacion) {
					maxCalificacion = calificaciones.get(i);
					estudianteMax = estudiantes.get(i);
				}
			}
			System.out.println("\n");
			System.out.println(
					"El estudiante con la calificación más alta es: " + estudianteMax + " con " + maxCalificacion);
		}
		System.out.println("\n");
		menu();
	}

}

package EJERCICIO1;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		System.out.println("Próximo legajo: " + Empleado.devuelveProximoLegajo());
		Persona persona1 = new Empleado();
		Persona persona2 = new Empleado();	
		Persona persona3 = new Empleado("29405292", "Ezequiel", "Vila", LocalDate.of(1999, 11, 7), "Masculino", "JB 645", "+5412349192" ,"tomas@gmail.com", "Desarrollador");
		Persona persona4 = new Empleado("38475629", "María", "González", LocalDate.of(1995, 6, 21), "Femenino", "AV 123", "+5411123456", "maria@gmail.com", "Analista");
		Persona persona5 = new Empleado("47283910", "Carlos", "Ramírez", LocalDate.of(1988, 3, 15), "Masculino", "Calle Falsa 456", "+5498765432", "carlos@gmail.com", "Project Manager");
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		System.out.println(persona4.toString());
		System.out.println(persona5.toString());
		System.out.println("Próximo legajo: " + Empleado.devuelveProximoLegajo());
	}

}

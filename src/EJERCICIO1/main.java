package EJERCICIO1;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		System.out.println("Próximo legajo: " + Empleado.devuelveProximoLegajo());
		Persona persona1 = new Empleado();
		Persona persona2 = new Empleado();
		Persona persona3 = new Empleado("29405292", "Ezequiel", "Vila", LocalDate.of(1999, 11, 7), "Masculino", "JB 645", "+5412349192" ,"tomas@gmail.com", "Desarrollador");
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		System.out.println("Próximo legajo: " + Empleado.devuelveProximoLegajo());
	}

}

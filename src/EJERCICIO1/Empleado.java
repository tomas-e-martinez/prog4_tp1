package EJERCICIO1;

import java.time.LocalDate;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	
	private static int siguienteLegajo = 1000;
	
	Empleado(){
		super();
		legajo = siguienteLegajo;
		siguienteLegajo++;
	}
	
	Empleado(
			String dni,
			String nombre,
			String apellido,
			LocalDate fechaNacimiento,
			String genero,
			String direccion,
			String telefono,
			String email,
			String puesto
			) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		legajo = siguienteLegajo;
		siguienteLegajo++;
		this.puesto = puesto;
	}
	
	public static int devuelveProximoLegajo() {
		return siguienteLegajo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", LEGAJO=" + legajo + ", PUESTO=" + puesto;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
}

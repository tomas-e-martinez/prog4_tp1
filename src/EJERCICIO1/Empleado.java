package EJERCICIO1;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	
	private static int siguienteLegajo = 1000;
	
	Empleado(){
		super();
		legajo = siguienteLegajo;
		puesto = "Puesto";
		siguienteLegajo++;
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
	public int getSiguienteLegajo() {
		return siguienteLegajo;
	}
	
	
}

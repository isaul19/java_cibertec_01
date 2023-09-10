package alumnos_02;

public class Persona {
	String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String despedirse() {
		return this.nombre + " se despide";
	}
	
	public String saludar() {
		return this.nombre + " te saluda";
	}
}

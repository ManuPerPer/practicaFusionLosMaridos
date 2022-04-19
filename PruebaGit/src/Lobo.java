
public class Lobo extends Mascota{
	private String pelaje;
	
	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public Lobo(String nombre) {
		super(nombre);
		
		
		
		// TODO Auto-generated constructor stub
		
		
		
	}

	@Override
	public String toString() {
		return "Hola equipo! Soy un lobo y me llamo " + getNombre() + " y te voy a contar algo o no.";
	}
	
	
	
	
}

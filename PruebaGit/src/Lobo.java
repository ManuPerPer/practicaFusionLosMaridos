
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
		return "Soy un lobo y me llamo " + getNombre() + ", y hago AUUUUUUUUUUUUU! y tengo el pelo de color" + pelaje;
	}

	
	
	
}

package Reino_Animalia;

public abstract class Animal {
	
	private String Locomover, Habitat;
	
	public void setLocomover(String Locomover) {
		this.Locomover = Locomover;
	}
	
	public String getLocomover() {
		return Locomover;
	}
	
	public void setHabitat(String Habitat) {
		this.Habitat = Habitat;
	}
	
	public String getHabitat() {
		return Habitat;
	}
	
	public abstract void Caracteristicas();

}

package Reino_Animalia;

public class Mamiferos extends Animal{

	@Override
	public void Caracteristicas() {
	
	System.out.println("Mamiferos");
	System.out.println("Locomo��o: "+this.getLocomover());
	System.out.println("Habitat: "+this.getHabitat());
	
   }
}

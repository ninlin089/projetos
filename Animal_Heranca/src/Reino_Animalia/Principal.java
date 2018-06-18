package Reino_Animalia;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		String op;
		int opc;
		
		op = JOptionPane.showInputDialog("Digite:\n1-mamiferos \n2-peixes");
		opc = Integer.parseInt(op);
		
		Animal p = new Peixes();
		Animal m = new Mamiferos();
		
		
		
		if(opc == 2) {
		p.setLocomover("Através de Nado");
		p.setHabitat("Aquático");
		p.Caracteristicas();
		
		}else if(opc ==1) {
		
		m.setLocomover("Andando, correndo, nadando");
		m.setHabitat("Superficie, Aquatico");
		m.Caracteristicas();
		}
		}

}

package aula;

// Importações 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Arquivo {
	
	String Dados []= new String[50];
	
	public static void main(String args[]) throws Exception {
		atualizar();
		excluir();
		gravar();
		leitura();

		}
		//GRAVAR
		 public static void gravar () throws IOException	{ 
		 FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i = 0; i < 20; i++) {
			 gravarArq.println("valor de i: " + i); 
		 }
		 arq.close();
		 }
		
		//LEITURA
		
		  public static void leitura () throws IOException	{ 
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains("teste")) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}

	
			//Alterar
	
	 public static void atualizar() throws IOException {
			 FileReader arqAtua = new FileReader("d:\\teste.txt");
			 BufferedReader lerArq = new BufferedReader(arqAtua);
			 
		     int num_linha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Linha a Ser Alterada: "));
		     int novo_num = Integer.parseInt(JOptionPane.showInputDialog(null,"Novo Valor de i: "));
	
		     String ler_lin = lerArq.readLine(); 
		     int m = 0;
		     while (ler_lin != null) {
		    	 if((m+1) == num_linha) {
		    	 	 dados[m] = "valor de i: "+ novo_num;
		    	 }
		    	 else if(ler_lin.contains("valor de i")) 
		    		 dados[m] = ler_lin;
		    	 
		    	 m++; 
		    	 ler_lin = lerArq.readLine();
		     }
		     
		     FileWriter arq = new FileWriter("d:\\teste.txt");
			 PrintWriter gravarArq = new PrintWriter(arq);
			 for(int i = 0; i < 10; i++) {
				 gravarArq.println("Valor de i" + dados[i]); 
			 }		
			 arq.close();
		 }
		 
		 
		 // EXCLUIR
		 
		  public static void excluir() throws IOException {	 
			 FileReader arqleitura = new FileReader("d:\\teste.txt");
			 BufferedReader lerArq = new BufferedReader(arqleitura);
			 
		     int num_linha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Linha a Ser EXCLUIDA ;D: "));
		    
		     String ler_lin = lerArq.readLine(); 
		     int m = 0;
		     while (ler_lin != null) {
		    	 if((m+1) != num_linha && ler_lin.contains("valor de i")) {
		    		 dados[m] = ler_lin;
		    	 }
		    	 m++; 
		    	 ler_lin = lerArq.readLine();
		     }
		     
		     FileWriter arq = new FileWriter("d:\\teste.txt");
			 PrintWriter gravarArq = new PrintWriter(arq);
			 for(int i = 0; i < 10; i++) {
				 gravarArq.println(dados[i]); 
			 }		
			 arq.close();
			 }
}

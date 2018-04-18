package conttroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import model.PessoaFisicaExec;

public class PessoaFisicajdbcDAO {
	
	private Connection conn;
	
	
	public PessoaFisicajdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(PessoaFisicaExec c) throws SQLException{
		String sql = "insert into pf ( nome, endereco, cidade, bairro, telefone, rg, sexo, cep, estado, celular, cpf) values ('" 
	    + c.getNome() + "','" + c.getEndereco() + "','" + c.getCidade() + "','" + c.getBairro() + "','" 
	    + c.getTelefone() + "','" + c.getRg() + "','" + c.getSexo() + "','" + c.getCep() + "','" 
	    + c.getEstado() + "','" + c.getCelular() + "','" + c.getCpf() + "')";
		System.out.println(sql);
		PreparedStatement prepareStatment = this.conn.prepareStatement(sql);
		prepareStatment.executeUpdate();
		prepareStatment.close();

	}
	
	
	// imprimir
	
	private static ResultSet res1;
	private static ResultSet res2;
	
	public void imprimir(){
	String sql = "select * from pf;";
	String sqll = "select COUNT(id) from pf;";
	System.out.println(sql);
	try {
		PreparedStatement prepareStatement = (PreparedStatement) this.conn.prepareStatement(sql);
		PreparedStatement prepareStatement2 = (PreparedStatement) this.conn.prepareStatement(sqll);
		res1 = prepareStatement.executeQuery();
		res2 = prepareStatement2.executeQuery();
		
		res2.next();
		
		int i2 = res2.getInt(1);
		for(int i = 1; i <= i2; i++) {
		
		res1.next();
		
		int id          = res1.getInt    ("id");
		String nome     = res1.getString ("nome");
		String endereco = res1.getString ("endereco");
		String cidade   = res1.getString ("cidade");
		String bairro   = res1.getString ("bairro");
		String telefone = res1.getString ("telefone");
		String Rg       = res1.getString ("rg");
		String sexo     = res1.getString ("sexo");			
		String cep      = res1.getString ("cep");
		String estado   = res1.getString ("estado");
		String celular  = res1.getString ("celular");
		String cpf      = res1.getString ("cpf");
		
		System.out.println(
				"\n Identificação: " +id+ 
				"\n Nome:          " + nome + 
				"\n Endereço:      " + endereco +
				"\n Cidade:        " + cidade +
				"\n Bairro:        " + bairro +
				"\n Telefone:      " + telefone +
				"\n RG:            " + Rg + 
				"\n Sexo:          " + sexo +
				"\n CEP:           " + cep +
				"\n Estado:        " + estado + 
				"\n Celular:       " + celular + 
				"\n CPF:           " + cpf);

		}

		prepareStatement.close();
	
	}catch(SQLException excep2) {
		excep2.printStackTrace();
	}
		
}
	
}



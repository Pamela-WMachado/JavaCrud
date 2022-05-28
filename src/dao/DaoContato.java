package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Contato;
import interfaces.IDAO;
import utilidades.Conexao;



public class DaoContato implements IDAO<Contato> {

	@Override
	public boolean salvar(Contato obj) {
		//inserindo comandos para salvar contatos no banco
		String sql = "insert into contatos(nome, email) values(?, ?)";
		
		//classe para criar conexao com o banco
		Connection con = Conexao.Conectar();
		
		//classe para enviar os dados ao banco
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getEmail());
			stm.execute(); //dados vindo da aplicaçao -> database
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Contato getOne(int id) {
		Contato ct = null;
		String sql = "select * from contatos where id = ?";
		Connection con = Conexao.Conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id); 
			
			//classe que trabalha pegando dados do database
			ResultSet rs = stm.executeQuery();  //dados do database -> aplicacao
			
			if(rs.next()) {
				ct = new Contato();
				ct.setId(rs.getInt("id"));
				ct.setNome(rs.getString("nome"));
				ct.setEmail(rs.getString("email"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ct;
	}

	@Override
	public List<Contato> getTodos() {
		List<Contato> lista = new  ArrayList<Contato>();
		Connection con = Conexao.Conectar();
		String sql = "select * from contatos";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				Contato ct = new Contato();
				ct.setId(rs.getInt("id"));
				ct.setNome(rs.getString("nome"));
				ct.setEmail(rs.getString("email"));
				lista.add(ct);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public boolean alterar(Contato obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	

}

package crud;

import java.util.List;

import dao.DaoContato;
import entidades.Contato;
import utilidades.Conexao;

public class Crud {

	public static void main(String[] args) {
		//Salvar();
		//buscarPorId();
		buscarTodos();
	}
	public static void buscarTodos() {
		List<Contato> lista = new DaoContato().getTodos();
		for (Contato ct : lista) {
			System.out.println(ct.toString());
		}
		
	}
	
	public static void buscarPorId() {
		//criando obj anonimo que faz ref ao obj criado dentro do metodo buscar
		Contato ct = new DaoContato().getOne(1);
		if (ct != null) {
			System.out.println(ct.toString());
		}

	}
	//metodos do crud
	public static void Salvar() {
		Contato ct = new Contato();
		ct.setNome("Priscila");
		ct.setEmail("pri@gmail.com");
		
		DaoContato dc = new DaoContato(); //instanciando classe com os metodos do crud contato
		
		//chamada do metodo salvar
		if (dc.salvar(ct)) {
			System.out.println("Contato salvo com sucesso");
		}
		
	}
	
	

}

package interfaces;

import java.util.List;

import entidades.Contato;

public interface IDAOContato {
	//criar contato
	boolean salvar(Contato ct);
	
	//consultar por id
	Contato getContato(int id);
	
	//listar todos os contatos
	List<Contato> getContatos();
	
	//update 
	boolean alterar(Contato ct);
	
	//deletar
	boolean deletar(int id);
	
	
}

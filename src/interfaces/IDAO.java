package interfaces;

import java.util.List;

public interface IDAO<T> {
//	INTERFACE GENERICA
	
	//salvar-criar contato/produto
	boolean salvar(T obj); 
	
	//metodo que retorna um T, (busca um elemento por id)
	T getOne(int id);
	
	//metodo que retorna todos elementos
	List<T> getTodos();
	
	//update
	boolean alterar(T obj);
	
	//deletar
	boolean deletar(int id);
	
	
	
	//
	
}

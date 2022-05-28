package crud;

import utilidades.Conexao;

public class Crud {

	public static void main(String[] args) {
		
		if (Conexao.Conectar() != null) {
			System.out.println("Conectado");
		}
	}

}

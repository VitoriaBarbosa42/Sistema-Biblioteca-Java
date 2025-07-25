package Pessoa;

import java.util.ArrayList;
import java.util.List;

import livro.Livro;

public class Cadastro extends Cliente{

	List<Livro> livros = new ArrayList<Livro>();
	
	Cadastro(String nome, String id, String dataNascimento, String email, String telefone, String rg) {
		super(nome, id, dataNascimento, email, telefone, rg);
	}
}

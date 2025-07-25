package livro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	
	final String TITULO;
	final String AUTOR;
	final String ISBN;
	final Integer ANOPDEPUBLICACAO;
	final Integer EDICAO;
	final Integer NUMERODEPAGINAS;
	final List<String> generos;
	
	
	public Livro (String titulo, String autor, String isbn, int anoPublicacao, int edicao, int numeroPaginas) {
		this.TITULO = titulo;
		this.AUTOR = autor;
		this.ISBN = isbn;
		this.ANOPDEPUBLICACAO = anoPublicacao;
		this.EDICAO = edicao;
		this.NUMERODEPAGINAS = numeroPaginas;
		this.generos =  new ArrayList<String>();
	}
	
	String adicionarGenero(String genero) {
		if (generos.size() < 3) {
			generos.add(genero);
			return genero + " adicionado";
		} else {
			return "O livro só pode ter até três gêneros.";
		}
	}
	
	String excluirGenero(int indice) {
		if(generos.size() > 0) {
			generos.remove(indice);
			return "Genero removido";
		} else {
			return "Ocorreu um erro. Verifique se o indice esta correto.";
		}
	}
	
	String listarLivro() {
		String f = String.format("--- INFORMAÇÕES DO LIVRO --- %nTitulo: %s%nAutor: %s%nISBN: %s%nAno de Publicação: %d%n"
				+ "Edição: %d%nNumero de Paginas: %d%n",
				this.TITULO, this.AUTOR, this.ISBN, this.ANOPDEPUBLICACAO, this.EDICAO, this.NUMERODEPAGINAS);
		return f;
	} 
	
	

}


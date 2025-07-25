package livro;

public class LivroTeste {
	public static void main(String[] args) {
		
		Livro livro = new Livro("abc", "def", "gh1", 2023, 4, 200);
		
		System.out.println(livro.adicionarGenero("Romance"));
		System.out.println(livro.adicionarGenero("Comedia"));
		System.out.println(livro.adicionarGenero("Suspense"));
		System.out.println(livro.adicionarGenero("horror"));
		System.out.println(livro.generos);
		System.out.printf(livro.listarLivro());
	}

}

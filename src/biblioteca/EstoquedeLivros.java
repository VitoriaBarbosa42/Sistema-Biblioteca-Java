package biblioteca;

import java.util.HashMap;
import java.util.Map;
import livro.Livro;

public class EstoquedeLivros {
	
	private Map<Integer, Map<Livro, Integer>> estoque = new HashMap<>();
	Integer quantidade;

	public void setEstoque(Integer id, Map<Livro, Integer> dados) {
		dados = new HashMap<Livro, Integer>();
		id++;
		this.estoque.put(id, dados);
	}
}

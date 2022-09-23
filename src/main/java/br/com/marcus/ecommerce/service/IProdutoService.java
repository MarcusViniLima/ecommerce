package br.com.marcus.ecommerce.service;

import java.util.ArrayList;

import br.com.marcus.ecommerce.model.Produto;

public interface IProdutoService {
    public ArrayList<Produto> recuperarTodos();
    public Produto recuperarPeloCodigo(Integer codigo);
    public Produto novoProduto(Produto novo);
	public Produto atualizarProduto(Integer codigo, Produto produto);;
	public void excluir(Integer codigo);
}

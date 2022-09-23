package br.com.marcus.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.marcus.ecommerce.DAO.ProdutoDAO;
import br.com.marcus.ecommerce.model.Produto;

@Service
public class ProdutoServiceImpl implements IProdutoService {

    @Autowired
    private ProdutoDAO dao;

    @Override
    public ArrayList<Produto> recuperarTodos() {
        return (ArrayList<Produto>) dao.findAll();
    }

    @Override
    public Produto recuperarPeloCodigo(Integer codigo) {
        return dao.findById(codigo).orElse(null);
    }

    @Override
    public Produto novoProduto(Produto produto) {
        return dao.save(produto);
    }
    
    @Override
	public Produto atualizarProduto(Integer codigo, Produto produto) {
		Produto res = dao.findById(codigo).orElse(null);

		if (res != null) {
			res.setDepartamento(produto.getDepartamento());
			res.setDescricao(produto.getDescricao());
			res.setEstoque(produto.getEstoque());
			res.setLinkFoto(produto.getLinkFoto());
			res.setNome(produto.getNome());
			res.setPreco(produto.getPreco());
			return dao.save(res);
		}
		return null;
	}
	@Override
	public void excluir(Integer codigo) {
		dao.deleteById(codigo);
	}
}

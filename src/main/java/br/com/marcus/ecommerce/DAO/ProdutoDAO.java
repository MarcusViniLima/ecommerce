package br.com.marcus.ecommerce.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.marcus.ecommerce.model.Produto;

public interface ProdutoDAO  extends CrudRepository< Produto, Integer>{
    
}

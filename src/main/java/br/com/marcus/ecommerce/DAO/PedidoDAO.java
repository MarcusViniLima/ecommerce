package br.com.marcus.ecommerce.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.marcus.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {
    
}

package br.com.marcus.ecommerce.service;
import java.util.List;

import br.com.marcus.ecommerce.model.Pedido;

public interface IPedidoService {

	public Pedido inserirNovo(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);
	public List<Pedido> listar();
}

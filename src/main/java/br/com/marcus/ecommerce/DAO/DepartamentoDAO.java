package br.com.marcus.ecommerce.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.marcus.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository< Departamento, Integer> {
    
}

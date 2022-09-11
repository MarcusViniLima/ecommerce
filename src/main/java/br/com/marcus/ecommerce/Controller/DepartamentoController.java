package br.com.marcus.ecommerce.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcus.ecommerce.DAO.DepartamentoDAO;
import br.com.marcus.ecommerce.model.Departamento;

@RestController
public class DepartamentoController {
    
    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
       ArrayList<Departamento> lista;
       lista =(ArrayList<Departamento>) dao.findAll();
       return lista;
    }
}

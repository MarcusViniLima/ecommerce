package br.com.marcus.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcus.ecommerce.DAO.DepartamentoDAO;
import br.com.marcus.ecommerce.model.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

    @Autowired
    private DepartamentoDAO dao;

    @Override
    public Departamento criarNovo(Departamento departamento) {
        if(departamento.getNome() != null){
            return dao.save(departamento);
        }
        return null;
    }

    @Override
    public Departamento atualizarDados(Departamento departamento) {
        if(departamento.getCodigo()!= null && departamento.getNome() != null){
            return dao.save(departamento);
        }
        return null;
    }

    @Override
    public ArrayList<Departamento> buscartodos() {
        ArrayList<Departamento> lista;
        lista = (ArrayList<Departamento>) dao.findAll();
        return lista;
    }

    @Override
    public Departamento buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirDepartamento(Integer id) {
        dao.deleteById(id);
        
    }
    
    
}

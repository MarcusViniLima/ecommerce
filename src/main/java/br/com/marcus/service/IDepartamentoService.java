package br.com.marcus.service;

import java.util.ArrayList;

import br.com.marcus.ecommerce.model.Departamento;

public interface IDepartamentoService {
    public Departamento criarNovo(Departamento departamento);
    public Departamento atualizarDados(Departamento departamento);
    public ArrayList<Departamento> buscartodos();
    public Departamento buscarPeloId(Integer id);
    public void excluirDepartamento(Integer id);
}

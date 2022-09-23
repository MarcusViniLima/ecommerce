package br.com.marcus.ecommerce.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.marcus.ecommerce.DAO.DepartamentoDAO;
import br.com.marcus.ecommerce.model.Departamento;
import br.com.marcus.ecommerce.service.DepartamentoServiceImpl;

@RestController
public class DepartamentoController {
    
    @Autowired
    private DepartamentoServiceImpl service;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
       return service.buscartodos();
    }
    
    @PostMapping("/departamentos")
    public ResponseEntity<Departamento> incluirNovo(@RequestBody Departamento novo){
        Departamento res =service.criarNovo(novo);
        if(res != null){
                return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/departamentos")
    public ResponseEntity<Departamento> alterar(@RequestBody Departamento novo){
        Departamento res =service.atualizarDados(novo);
        if(res != null){
                return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> excluirDepartamento(@PathVariable Integer id){
        service.excluirDepartamento(id);;
        return ResponseEntity.ok(null);
    }

    @GetMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> bucarPeloId(@PathVariable Integer id){
        Departamento res =service.buscarPeloId(id);
        if(res != null){
                return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

}

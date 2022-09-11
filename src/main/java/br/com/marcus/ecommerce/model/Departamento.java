package br.com.marcus.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {

    @Column(name="codigo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name="nome",length = 50, nullable = false)
    private String nome;

    @Column(name="descricao", nullable = true, columnDefinition = "TEXT")
    private String descricao;

    public Integer getCodigo() {
        return codigo;
    }public String getDescricao() {
        return descricao;
    }public String getNome() {
        return nome;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

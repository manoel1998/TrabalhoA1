package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.Subcategoria;

public class Produto {

    private int codigo;

    private int codigoSubcategoria;

    private String descricao;

    private double valor;

    private LocalDate dataDeInclusao;

    private List<Subcategoria> subcategorias;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoSubcategoria() {
        return codigoSubcategoria;
    }

    public void setCodigoSubcategoria(int codigoSubcategoria) {
        this.codigoSubcategoria = codigoSubcategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Produto() {
    }

    public Produto(int codigo, int codigoSubcategoria, String descricao, double valor, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoSubcategoria = codigoSubcategoria;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeInclusao = dataDeInclusao;
    }

}

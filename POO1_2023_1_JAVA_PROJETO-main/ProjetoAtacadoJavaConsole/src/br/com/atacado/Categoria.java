package br.com.atacado;

import java.time.LocalDate;

public class Categoria {
    private int codigo;

    private String decricao;

    private LocalDate dataDeInclusao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public Categoria() {
    }

    public Categoria(int codigo, String decricao, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.decricao = decricao;
        this.dataDeInclusao = dataDeInclusao;
    }
    
}

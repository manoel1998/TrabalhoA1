package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataInsert;
    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getDataInsert() {
        return dataInsert;
    }
    public BaseTransporte() {
    }
    public BaseTransporte(int codigo, String descricao, LocalDate dataInsert) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInsert = dataInsert;
    }
    
}

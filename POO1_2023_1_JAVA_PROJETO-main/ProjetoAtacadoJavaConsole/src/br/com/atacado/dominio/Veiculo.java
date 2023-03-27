package br.com.atacado.dominio;

import java.time.LocalDate;

import br.com.atacado.Frota;

public class Veiculo extends BaseTransporte{
    public int codigoFrota;
    public String placa;
    Frota frota;
    public Veiculo() {
    }
    public Veiculo(int codigo, String descricao, LocalDate dataInsert, int codigoFrota, String placa) {
        super(codigo, descricao, dataInsert);
        this.codigoFrota = codigoFrota;
        this.placa = placa;
    }
    public Veiculo(int codigoFrota, String placa) {
        this.codigoFrota = codigoFrota;
        this.placa = placa;
    }

    
    
}

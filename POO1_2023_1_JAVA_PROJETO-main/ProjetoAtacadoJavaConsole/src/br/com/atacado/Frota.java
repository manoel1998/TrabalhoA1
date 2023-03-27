package br.com.atacado;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.atacado.dominio.BaseTransporte;
import br.com.atacado.dominio.Veiculo;

public class Frota extends BaseTransporte {

    ArrayList<Veiculo> veiculos;
    public Frota(int codigo, String descricao, LocalDate dataInsert) {
        super(codigo, descricao, dataInsert);
    }

    public Frota() {
    }
    
}

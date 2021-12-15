package projetoSolid.src.br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {
    
    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;


    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

   public String getNome() {
        return dadosPessoais.getNome();
    }

    public String getCpf() {
        return dadosPessoais.getCpf();
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

    public BigDecimal getSalario() {
        return dadosPessoais.getSalario();
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

}

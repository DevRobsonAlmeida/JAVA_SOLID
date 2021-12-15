/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoSolid.src.br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import projetoSolid.src.br.com.alura.rh.service.tributacao.Reajuste;

/**
 *
 * @author robson-pc
 */
public class Anuenio implements Reajuste{
    private BigDecimal valor;
    private LocalDate data;

    public Anuenio(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    
    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

}

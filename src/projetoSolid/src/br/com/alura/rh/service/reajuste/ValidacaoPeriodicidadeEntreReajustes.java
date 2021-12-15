/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoSolid.src.br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import projetoSolid.src.br.com.alura.rh.ValidacaoException;
import projetoSolid.src.br.com.alura.rh.model.Funcionario;

/**
 *
 * @author robson-pc
 */
public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste > 6) {
            throw new ValidacaoException("Intervalo de Reajustes deve ser de no minimo 6 meses");
        }
    }
}

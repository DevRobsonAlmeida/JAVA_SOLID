/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoSolid.src.br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import projetoSolid.src.br.com.alura.rh.model.Funcionario;

/**
 *
 * @author robson-pc
 */
public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}

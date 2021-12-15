/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoSolid.src.br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author robson-pc
 */
public interface Reajuste {

    BigDecimal valor();

    LocalDate data();
}

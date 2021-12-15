/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoSolid.src.br.com.alura.rh.service.tributacao;

import projetoSolid.src.br.com.alura.rh.service.tributacao.Reajuste;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public interface ReajusteTributavel extends Reajuste{

    BigDecimal valorImpostoDeRenda();
}

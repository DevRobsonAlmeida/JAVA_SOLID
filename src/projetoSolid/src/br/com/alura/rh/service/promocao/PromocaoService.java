/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoSolid.src.br.com.alura.rh.service.promocao;

import projetoSolid.src.br.com.alura.rh.ValidacaoException;
import projetoSolid.src.br.com.alura.rh.model.Cargo;
import projetoSolid.src.br.com.alura.rh.model.Funcionario;

/**
 *
 * @author robson-pc
 */
public class PromocaoService {
    
    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }
        
        if (metaBatida) {
        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta!");
        }
    }
}

package br.uniriotec.pm20181.modelo.plano;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe que representa um plano de vôo
 */
public class PlanoVoo {
    @Getter private List<Acao> listaAcoes = new ArrayList<>();

    /**
     * Construtor que recebe um array de ações
     * @param acoes array de ações
     */
    public PlanoVoo(Acao... acoes) {
        listaAcoes.addAll(Arrays.asList(acoes));
    }
}

package br.com.rodrigolee56.MeuPortifolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projeto {
    private String nome;
    private String descricao;
    private String link;
}

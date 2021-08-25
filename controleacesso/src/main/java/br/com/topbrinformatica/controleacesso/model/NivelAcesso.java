package br.com.topbrinformatica.controleacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;
}

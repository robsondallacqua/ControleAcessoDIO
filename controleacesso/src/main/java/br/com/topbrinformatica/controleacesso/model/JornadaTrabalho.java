package br.com.topbrinformatica.controleacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    @Override
    public String toString(){
        return new StringBuilder().append("{\n")
                .append("id:")
                .append(id)
                .append(",\n")
                .append("descricao:")
                .append(descricao)
                .append("\n}")
                .toString();
    }
}

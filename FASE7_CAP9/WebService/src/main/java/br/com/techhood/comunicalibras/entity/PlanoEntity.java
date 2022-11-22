package br.com.techhood.comunicalibras.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_cml_plano")
@GenericGenerator(
        name = "planoSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
                @org.hibernate.annotations.Parameter(name = "sequence_name", value = "seq_cml_plano"),
                @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
        }
)
public class PlanoEntity {

    @Id
    @Column(name = "id_plano")
    @GeneratedValue(generator = "planoSequenceGenerator")
    private Long id;

    @Column(name = "nm_nome", length = 100)
    private String nome;

    @Column(name = "nm_codigo", length = 100)
    private String codigo;

    @Column(name = "nu_valor")
    private Double valor;
}
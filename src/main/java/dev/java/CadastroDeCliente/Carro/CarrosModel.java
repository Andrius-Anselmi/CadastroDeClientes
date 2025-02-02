package dev.java.CadastroDeCliente.Carro;

import dev.java.CadastroDeCliente.Cliente.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "ANO_DE_FABRICACAO")
    private int ano_fabricacao;

    @ManyToOne // varios carros podem ter um cliente/dono
    @JoinColumn(name = "carro_id") // Foreing Key - chave estrangeira
    private ClienteModel cliente;


}

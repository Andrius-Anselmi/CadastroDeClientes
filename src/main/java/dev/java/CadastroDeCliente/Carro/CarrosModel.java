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
    private Long id;
    private String marca;
    private String modelo;
    private int ano_fabricacao;
    @ManyToOne // varios carros podem ter um cliente/dono
    @JoinColumn(name = "carro_id") // Foreing Key - chave estrangeira
    private ClienteModel cliente;


}

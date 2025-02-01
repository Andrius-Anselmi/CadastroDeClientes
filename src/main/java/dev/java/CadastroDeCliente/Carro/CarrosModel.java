package dev.java.CadastroDeCliente.Carro;

import dev.java.CadastroDeCliente.Cliente.ClienteModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_carros")
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

    public CarrosModel(String marca, String modelo, ClienteModel cliente, int ano_fabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cliente = cliente;
        this.ano_fabricacao = ano_fabricacao;
    }
}

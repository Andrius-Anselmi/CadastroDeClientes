package dev.java.CadastroDeCliente.Cliente;

import dev.java.CadastroDeCliente.Carro.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // transforma nossa classe em uma entidade no BANCO DE DADOS
@Table(name = "tb_cadastro") // transforma nossa entidade em uma tabela
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private int idade;
    @OneToMany(mappedBy = "cliente") // um cliente pode ter varios carros
    private List<CarrosModel> carro; // crio a coluna carros dentro da coluna Cliente
    // o OneToMany sempre vai ser uma lista

}

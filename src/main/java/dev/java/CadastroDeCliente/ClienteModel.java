package dev.java.CadastroDeCliente;

import jakarta.persistence.*;

@Entity // transforma nossa classe em uma entidade no BANCO DE DADOS
@Table(name = "tb_cadastro") // transforma nossa entidade em uma tabela

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private int idade;

    public ClienteModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


}

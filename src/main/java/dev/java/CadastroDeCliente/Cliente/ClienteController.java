package dev.java.CadastroDeCliente.Cliente;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/bemvindo")
    public String boasVindas() {

        return "Seja bem vindo";
    }

    //Adicionar cliente (CREATE)
    @PostMapping("/criar")
    public String criarCliente() {

        return "Cliente criado";
    }

    // Mostrar todos clientes (READ)
    @GetMapping("/mostrartodos")
    public String mostrarTodosClientes() {

        return "Exibindo clientes";
    }
    //Mostrar clientes por ID (READ)
    @GetMapping("/mostrarid")
    public String mostrarPorID(){

        return "Exibindo cliente por ID";
    }

    //Alterar dados do cliente por ID (UPDATE)
    @PutMapping("/alterar")
    public String alterarDadosClientesPorID() {

        return "Alterando dados dos clientes por ID";
    }
    //Deltar cliente por ID (DELETE)
    @DeleteMapping("/deletar")
    public String deletarPorID() {

        return "Cliente deletado com sucesso";
    }



}

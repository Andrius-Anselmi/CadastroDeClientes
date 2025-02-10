package dev.java.CadastroDeCliente.Cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    //preciso acessar a funcao listarClientes criada dentro do clienteService
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

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
    @GetMapping("/mostrar")
    public List<ClienteModel> mostrarTodosClientes() {

        return clienteService.listarClientes(); // chamo a funcao listarClientes atraves da instancia clienteService
    }
    //Mostrar clientes por ID (READ)
    @GetMapping("/mostrar/{id}")
    public ClienteModel listarClientesPorId(@PathVariable Long id){
        return clienteService.listarClientesPorId(id);
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

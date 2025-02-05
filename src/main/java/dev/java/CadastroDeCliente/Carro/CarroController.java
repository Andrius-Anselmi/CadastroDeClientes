package dev.java.CadastroDeCliente.Carro;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carro")
public class CarroController {

    //boas vindas

    @GetMapping("/bemvindo")
    public String boasVindas() {

        return "Seja vem vindo ao controller de Carro";
    }

    //Adicionar Carro (CREATE)
    @PostMapping("/criar")
    public String criarCarro() {

        return "carro criado";
    }

    //Mostrar carros (READ)
    @GetMapping("/mostrartodos")
    public String mostrarCarros() {

        return "mostrando carros";
    }

    //Mostra carro por ID (READ)
    @GetMapping("/mostrarid")
    public String mostrarCarroPorID() {

        return "Exibindo carro por ID";
    }

    //Alterar dados do carro por ID (UPDATE)
    @PutMapping("/alterar")
    public String alterarDadosDoCarro() {

        return "Alterando dados dos carros por ID";
    }

    //Deletar carro por ID
    @DeleteMapping("/deletar")
    public String deletarCarroPorID() {

        return "Carro deletado com sucesso";
    }

}

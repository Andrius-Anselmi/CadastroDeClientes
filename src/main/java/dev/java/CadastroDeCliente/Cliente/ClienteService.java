package dev.java.CadastroDeCliente.Cliente;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository; // precisamos que o ClienteService tenha acesso ao ClienteRepository

    //precisamos instanciar agr, temos duas maneiras
    // 1 - usar @Autowired
    //2 - usar um contructor


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // vamos criar o metódo pra listar
    public List<ClienteModel> listarClientes() {

        return clienteRepository.findAll(); // acessando as QUIERES do Repository
    }
}

package dev.java.CadastroDeCliente.Cliente;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository; // precisamos que o ClienteService tenha acesso ao ClienteRepository

    //precisamos instanciar agr, temos duas maneiras
    // 1 - usar @Autowired
    //2 - usar um contructor


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //Metódo para listar clientes
    public List<ClienteModel> listarClientes() {

        return clienteRepository.findAll(); // acessando as QUIERES do Repository
    }

    //Metódo para listar clientes por ID
    public ClienteModel listarClientesPorId(Long id) {
        Optional<ClienteModel> clientePorId = clienteRepository.findById(id);
        return clientePorId.orElse(null);
    }

}

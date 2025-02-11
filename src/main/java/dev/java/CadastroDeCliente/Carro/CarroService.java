package dev.java.CadastroDeCliente.Carro;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    private CarroRepository carroRepository; // acessar o repositorio de carros

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    //Metódo para mostrar carros
    public List<CarrosModel> mostrarTodosCarros() {
        return carroRepository.findAll();
    }

    //Metódo para mostrar carros por ID
    public CarrosModel carrosPorId(Long id) {
        Optional<CarrosModel> carroPorId = carroRepository.findById(id);
        return carroPorId.orElse(null);
    }

}

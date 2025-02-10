package dev.java.CadastroDeCliente.Carro;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private CarroRepository carroRepository; // acessar o repositorio de carros

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<CarrosModel> mostrarTodosCarros() {

        return carroRepository.findAll();
    }


}

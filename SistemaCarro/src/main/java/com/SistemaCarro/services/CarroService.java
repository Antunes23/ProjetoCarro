package com.SistemaCarro.services;

import com.SistemaCarro.entities.Carro;
import com.SistemaCarro.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarroService {
    private final CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro saveCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro getCarroById(Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    public void deleteCarro(Long id) {
        carroRepository.deleteById(id);
    }
}

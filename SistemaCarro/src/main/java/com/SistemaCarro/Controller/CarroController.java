package com.SistemaCarro.Controller;

import com.SistemaCarro.entities.Carro;
import com.SistemaCarro.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarroController {
    private final CarroService carroService;

    @Autowired
    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @PostMapping
    public Carro createCarro(@RequestBody Carro carro) {
        return carroService.saveCarro(carro);
    }

    @GetMapping("/{id}")
    public Carro getCarro(@PathVariable Long id) {
        return carroService.getCarroById(id);
    }

    @GetMapping
    public List<Carro> getAllCarros() {
        return carroService.getAllCarros();
    }

    @DeleteMapping("/{id}")
    public void deleteCarro(@PathVariable Long id) {
        carroService.deleteCarro(id);
    }
}

package com.SistemaCarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SistemaCarro.entities.*;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}

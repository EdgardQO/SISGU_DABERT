package com.sisgudabert.sisgudabert.persistence.service;

import com.sisgudabert.sisgudabert.persistence.entity.EstudianteEntity;
import com.sisgudabert.sisgudabert.persistence.repository.EstudianteRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class EstudianteService {
    private final EstudianteRepository estudianteRepository;
    private final PasswordEncoder passwordEncoder;

    public EstudianteService(EstudianteRepository estudianteRepository, PasswordEncoder passwordEncoder) {
        this.estudianteRepository = estudianteRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<EstudianteEntity> getAllEstudiantes() {
        return this.estudianteRepository.findAll();
    }
    public EstudianteEntity getbyCodigo(Integer codigo) {
        return this.estudianteRepository.findByCodigoEstudiante(codigo);
    }
}

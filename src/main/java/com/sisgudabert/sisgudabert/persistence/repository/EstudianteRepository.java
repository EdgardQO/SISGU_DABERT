package com.sisgudabert.sisgudabert.persistence.repository;

import com.sisgudabert.sisgudabert.persistence.entity.EstudianteEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface EstudianteRepository extends ListCrudRepository<EstudianteEntity, String> {
    EstudianteEntity findByCodigoEstudiante(String codigoEstudiante);
}

package com.sisgudabert.sisgudabert.persistence.repository;

import com.sisgudabert.sisgudabert.persistence.entity.RolSistemaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface RolSistemaRepository extends ListCrudRepository<RolSistemaEntity, Integer> {
    RolSistemaEntity findByNombreRol (String nombreRol);
}

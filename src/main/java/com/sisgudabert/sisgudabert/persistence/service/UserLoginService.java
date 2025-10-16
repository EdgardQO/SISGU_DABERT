package com.sisgudabert.sisgudabert.persistence.service;

import com.sisgudabert.sisgudabert.persistence.entity.EstudianteEntity;
import com.sisgudabert.sisgudabert.persistence.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService implements UserDetailsService {
    private final EstudianteRepository estudianteRepository;

    @Autowired
    public UserLoginService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EstudianteEntity estudianteEntity = estudianteRepository.findByCodigoEstudiante(username);
    }
}

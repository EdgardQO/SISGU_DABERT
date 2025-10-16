package com.sisgudabert.sisgudabert.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles_sistema")
@Getter
@Setter
@NoArgsConstructor
public class RolSistemaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol",nullable = false)
    private Integer idRol;

    @Column(name = "nombre_rol", nullable = false, length = 100, unique = true)
    private String nombreRol;
}
/*
* 	CREATE TABLE estudiante(
		id_estudiante serial PRIMARY KEY,
		id_rol int,
		codigo_estudiante bigint,
		nombre_estudiante varchar(100),
		contraseña varchar(100),
		constraint fk_rol foreign key (id_rol) references roles_sistema(id_rol)
	);
	CREATE TABLE roles_sistema (
		id_rol serial PRIMARY KEY,
		nombre_rol varchar(100)
	);
* */

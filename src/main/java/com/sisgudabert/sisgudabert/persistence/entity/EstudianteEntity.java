package com.sisgudabert.sisgudabert.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="estudiante")
@Getter
@Setter
@NoArgsConstructor
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante", nullable = false)
    private Integer idEstudiante;

    @Column(name = "id_rol", nullable = false)
    private Integer idRol;

    @Column(nullable = false, length = 10, unique = true)
    private String codigoEstudiante;

    @Column(nullable = false, length = 100)
    private String nombreEstudiante;

    @Column(name = "contraseña", nullable = false)
    private String contrasena;

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", insertable = false, updatable = false)
    private RolSistemaEntity rolSistema;
}
/*
	CREATE TABLE estudiante(
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

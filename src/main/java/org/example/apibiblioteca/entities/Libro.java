package org.example.apibiblioteca.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Libro {
    @Id
    @GeneratedValue
    private long id;

    private String titulo;
    private String genero;
    private String publicion;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor Autor;
}

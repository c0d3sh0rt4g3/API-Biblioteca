package org.example.apibiblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String nacionalidad;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private ArrayList<Libro> libros;
}

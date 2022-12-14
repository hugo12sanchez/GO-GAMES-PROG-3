package com.example.grupo.belmg.paginavideojuegos.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "estudios")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Estudio extends Base{



    @NotNull(message = "Se necesita el nombre del estudio.")
    @Size(min=3,max=30, message="El nombre del estudio debe tener entre 5 y 30 caracteres.")
    private String nombre;

    /*@OneToMany(mappedBy = "estudio")
    private List<Videojuego> videojuegos;*/


}

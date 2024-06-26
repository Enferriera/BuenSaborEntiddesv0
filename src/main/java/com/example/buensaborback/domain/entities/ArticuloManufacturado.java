package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@SuperBuilder
@Audited
public class ArticuloManufacturado extends Articulo {


    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;


    @OneToMany
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'articuloManufacturado_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "articuloManufacturado_id")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

//    @Builder
//    public ArticuloManufacturado(String denominacion, Double precioVenta, UnidadMedida unidadMedida, String descripcion, Integer tiempoEstimadoMinutos, String preparacion){
//        super(denominacion,precioVenta,unidadMedida);
//        this.descripcion = descripcion;
//        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
//        this.preparacion = preparacion;
//        this.articuloManufacturadoDetalles = new HashSet<>();
//    }

}

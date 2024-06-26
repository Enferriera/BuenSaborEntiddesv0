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
@Entity
@ToString
@SuperBuilder
@Audited
public class ArticuloInsumo extends Articulo {

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

//    @Builder
//    public ArticuloInsumo(String denominacion, Double precioVenta, Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar, UnidadMedida unidadMedida) {
//        super(denominacion, precioVenta, unidadMedida);
//        this.precioCompra = precioCompra;
//        this.stockActual = stockActual;
//        this.stockMaximo = stockMaximo;
//        this.esParaElaborar = esParaElaborar;
//    }

}

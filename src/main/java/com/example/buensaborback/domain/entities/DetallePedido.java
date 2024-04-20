package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
@Audited
public class DetallePedido extends Base{

    private Integer cantidad;
    private Double subTotal;

    @ManyToOne
    private Articulo articulo;

}

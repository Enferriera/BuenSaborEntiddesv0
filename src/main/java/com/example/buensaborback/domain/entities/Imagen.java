package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
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
public class Imagen extends Base{

    private String url;
    
}
